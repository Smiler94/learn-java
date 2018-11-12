package com.lz_java.servlet;

import com.lz_java.annoation.MyController;
import com.lz_java.annoation.MyRequestMapping;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.*;

public class MyDispatchServlet extends HttpServlet{

    private Map<String, Object> iocContainer = new HashMap<String, Object>();

    private Map<String, Method> handlerMapping = new HashMap<String, Method>();

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
        
    }
}
