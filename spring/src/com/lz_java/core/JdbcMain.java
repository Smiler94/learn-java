package com.lz_java.core;

import com.lz_java.core.model.User;
import com.lz_java.core.service.JdbcUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcUserService service = (JdbcUserService) ctx.getBean("userService");
        User user = new User();
        user.setName("linzhen");
        user.setAge(25);
        service.insert(user);

        User ser2 = service.findUserById(1);
        System.out.println(ser2);
    }
}
