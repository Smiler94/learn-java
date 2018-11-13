package com.lz_java.servlet;

import com.lz_java.annoation.MyController;
import com.lz_java.annoation.MyRequestMapping;
import com.lz_java.view.MyViewResolver;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;

public class MyDispatchServlet extends HttpServlet{

    private Map<String, Object> iocContainer = new HashMap<String, Object>();

    private Map<String, Method> handlerMapping = new HashMap<String, Method>();

    private MyViewResolver myViewResolver;
    @Override
    public void init(ServletConfig config) throws ServletException {
        scanController(config);
    }

    public void scanController(ServletConfig config) {
        SAXReader reader = new SAXReader();

        try {
            String path = config.getServletContext().getRealPath("") + "\\WEB-INF\\classes\\"+config.getInitParameter("contextConfigLocation");
            Document document = reader.read(path);
            Element root = document.getRootElement();
            Iterator iter = root.elementIterator();
            while(iter.hasNext()) {
                Element ele = (Element) iter.next();
                if (ele.getName().equals("component-scan")) {
                    String packageName = ele.attributeValue("base-package");
                    // 获取包下所有的类名
                    List<String> list = getClassNames(packageName);
                    for(String str : list) {
                        Class clazz = Class.forName(str);
                        if (clazz.isAnnotationPresent(MyController.class)) {
                            MyRequestMapping annotation = (MyRequestMapping) clazz.getAnnotation(MyRequestMapping.class);
                            String value = annotation.value().substring(1);
                            iocContainer.put(value, clazz.newInstance());
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 获取包下所有的类名
    public List<String> getClassNames(String packageName) {
        List<String> classNameList = new ArrayList<String>();
        String packagePath = packageName.replace(".", "/");
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        URL url = loader.getResource(packagePath);
        if (url != null) {
            File file = new File(url.getPath());
            File[] childFiles = file.listFiles();
            for(File childFile : childFiles) {
                String className = packageName + "." + childFile.getName().replace(".class", "");
                classNameList.add(className);
            }
        }
        return classNameList;
    }
    // 初始化 handler 映射
    public void initHandlerMapping() {
        for(String str : iocContainer.keySet()) {
            Class clazz = iocContainer.get(str).getClass();
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(MyRequestMapping.class)) {
                    MyRequestMapping annotation = method.getAnnotation(MyRequestMapping.class);
                    String value = annotation.value().substring(1);
                    handlerMapping.put(value, method);
                }
            }
        }
    }
    // 加载自定义试图解析器
    public void loadViewResolver(ServletConfig config) {
        SAXReader reader = new SAXReader();

        try {
            // 解析 springmvc.xml
            String path = config.getServletContext().getRealPath("") + "\\WEB-INF\\classes\\" + config.getInitParameter("contextConfigLocation");
            Document document = reader.read(path);
            Element root = document.getRootElement();
            Iterator iter = root.elementIterator();
            while(iter.hasNext()) {
                Element ele = (Element) iter.next();
                if (ele.getName().equals("bean")) {
                    String className = ele.attributeValue("class");
                    Class clazz = Class.forName(className);
                    Object obj = clazz.newInstance();
                    Method prefixMethod = clazz.getMethod("setPrefix", String.class);
                    Method suffixMethod = clazz.getMethod("setSuffix", String.class);
                    Iterator beanIter = ele.elementIterator();
                    Map<String, String> propertyMap = new HashMap<String, String>();
                    while(beanIter.hasNext()) {
                        Element beanEle = (Element) beanIter.next();
                        String name = beanEle.attributeValue("name");
                        String value = beanEle.attributeValue("value");
                        propertyMap.put(name, value);
                    }
                    for(String str:propertyMap.keySet()) {
                        if (str.equals("prefix")) {
                            prefixMethod.invoke(obj, propertyMap.get(str));
                        }
                        if (str.equals("suffix")) {
                            suffixMethod.invoke(obj, propertyMap.get(str));
                        }
                    }
                    myViewResolver = (MyViewResolver) obj;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String handlerUri = request.getRequestURI().split("/")[2];

        Object obj = iocContainer.get(handlerUri);

        String methodUri = request.getRequestURI().split("/")[3];
        Method method = handlerMapping.get(methodUri);
        try {
            String value = (String) method.invoke(obj);
            String result = myViewResolver.jspMapping(value);
            request.getRequestDispatcher(result).forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
