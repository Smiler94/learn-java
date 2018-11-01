package com.lz_java.core;

import com.lz_java.core.model.User;
import com.lz_java.core.service.JdbcDaoSupportUserService;
import com.lz_java.core.service.JdbcTemplateUserService;
import com.lz_java.core.service.JdbcUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcMain {
//    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//
//        User user = new User();
//        user.setName("linzhen");
//        user.setAge(26);
//        // 三种方式
////        JdbcUserService service = (JdbcUserService) ctx.getBean("userService");
////        service.insert(user);
////        User ser2 = service.findUserById(1);
////        System.out.println(ser2);
//
////        JdbcTemplateUserService tempService = (JdbcTemplateUserService) ctx.getBean("userTempService");
////        tempService.insert(user);
//
//        JdbcDaoSupportUserService daoService = (JdbcDaoSupportUserService) ctx.getBean("userDaoSupportService");
//        daoService.insert(user);
//    }

    public static void main(String args[]) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcDaoSupportUserService daoService = (JdbcDaoSupportUserService) ctx.getBean("userDaoSupportService");
        User user = daoService.findUserById(1);
        System.out.println(user);

        User user2 = daoService.findUserById2(2);
        System.out.println(user2);

        List<User> users = daoService.findAll();
        System.out.println(users);

        String name = daoService.findNameById(1);
        System.out.println(name);

        int total = daoService.getTotal();
        System.out.println(total);
    }
}
