package com.lz_java.core;

import com.lz_java.core.config.AppConfig;
import com.lz_java.core.model.User;
import com.lz_java.core.service.JdbcDaoSupportUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String args[]) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        JdbcDaoSupportUserService userService = (JdbcDaoSupportUserService) ctx.getBean("userService");

        User user = userService.findUserById(1);
        System.out.println(user);

    }
}
