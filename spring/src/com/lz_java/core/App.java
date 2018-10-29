package com.lz_java.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld obj = (HelloWorld) ctx.getBean("helloBean");
        obj.sayHello();
    }
}
