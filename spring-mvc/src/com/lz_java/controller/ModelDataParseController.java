package com.lz_java.controller;

import com.lz_java.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.Map;

@Controller
public class ModelDataParseController {
    @RequestMapping(value="mapTest")
    public String mapTest(Map<String, Object> map) {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        map.put("user", user);
        return "hello";
    }

    @RequestMapping(value="modelTest")
    public String modelTest(Model model) {
        User user = new User();
        user.setId(1);
        user.setName("李四");
        model.addAttribute("user", user);
        return "hello";
    }

    public User getUser() {
        User user = new User();
        user.setId(1);
        user.setName("李四");
        return user;
    }

    // ModelAndView不但包含模型数据，还包含了视图信息
    // ModelAndView的8种方式
    @RequestMapping(value="modelView1")
    public ModelAndView modelView1() {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setId(1);
        user.setName("李四");
        modelAndView.addObject("user", user);
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    // 使用InternalResourceView
    @RequestMapping(value="modelView2")
    public ModelAndView modelView2() {
        ModelAndView modelAndView = new ModelAndView();
        User user = getUser();
        modelAndView.addObject("user", user);
        View view = new InternalResourceView("/hello.jsp");
        modelAndView.setView(view);
        return modelAndView;
    }
}
