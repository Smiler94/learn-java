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
        initHandlerMapping();
        loadViewResolver(config);
    }

    // 扫描控制器
    public void scanController(ServletConfig config) {
        SAXReader reader = new SAXReader();
        try {
            // 获取配置文件的路径
            String path = config.getServletContext().getRealPath("") + config.getInitParameter("contextConfigLocation");
            // 开始解析
            Document document = reader.read(path);
            Element root = document.getRootElement();
            // 从根节点开始
            Iterator iter = root.elementIterator();
            while(iter.hasNext()) {
                Element ele = (Element) iter.next();
                // 节点名称为component-scan
                if (ele.getName().equals("component-scan")) {
                    // 获取控制器存放的目录
                    String packageName = ele.attributeValue("base-package") + ".controller";
                    // 获取包下所有的类名
                    List<String> list = getClassNames(packageName);
                    for(String str : list) {
                        Class clazz = Class.forName(str);
                        // 检查是否包含有MyController 注解
                        if (clazz.isAnnotationPresent(MyController.class)) {
                            // 控制器对应的 RequestMapping注解
                            MyRequestMapping annotation = (MyRequestMapping) clazz.getAnnotation(MyRequestMapping.class);
                            // 获取注解名
                            String value = annotation.value().substring(1);// 去掉左边的/
                            // 存放到ioc 容器中
                            iocContainer.put(value, clazz.newInstance());
                        }
                    }
                }
            }
            System.out.println(iocContainer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 获取包下所有的类名
    public List<String> getClassNames(String packageName) {
        List<String> classNameList = new ArrayList<String>();
        // 包名转化为目录名
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
        // 解析扫描到的控制器中的方法
        for(String str : iocContainer.keySet()) {
            Class clazz = iocContainer.get(str).getClass();
            // 获取控制器的所有方法
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                // 是否包含有MyRequestMapping 注解
                if (method.isAnnotationPresent(MyRequestMapping.class)) {
                    MyRequestMapping annotation = method.getAnnotation(MyRequestMapping.class);
                    // 获取注解名
                    String value = annotation.value().substring(1);
                    // 存放到处理方法的容器
                    handlerMapping.put(value, method);
                }
            }
        }
        System.out.println(handlerMapping);
    }
    // 加载自定义试图解析器
    public void loadViewResolver(ServletConfig config) {
        SAXReader reader = new SAXReader();

        try {
            // 解析 springmvc.xml
            String path = config.getServletContext().getRealPath("") + config.getInitParameter("contextConfigLocation");
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
        String handlerUri = request.getRequestURI().split("/")[1];
        System.out.println(handlerUri);
        Object obj = iocContainer.get(handlerUri);

        String methodUri = request.getRequestURI().split("/")[2];
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
