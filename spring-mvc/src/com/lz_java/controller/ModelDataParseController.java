package com.lz_java.controller;

import com.lz_java.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
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
        View view = new InternalResourceView("/WEB-INF/jsp/hello.jsp");
        modelAndView.setView(view);
        return modelAndView;
    }

    @RequestMapping(value="modelView3")
    public ModelAndView modelView3() {
        ModelAndView modelAndView = new ModelAndView("hello");
        User user = getUser();
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping(value="modelView4")
    public ModelAndView modelView4() {
        View view = new InternalResourceView("/WEB-INF/jsp/hello.jsp");
        ModelAndView modelAndView = new ModelAndView(view);
        User user = getUser();
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping(value="modelView5")
    public ModelAndView modelView5() {
        Map<String, Object> map = new HashMap<String, Object>();
        User user = getUser();
        map.put("user", user);
        ModelAndView modelAndView = new ModelAndView("hello", map);
        return modelAndView;
    }
    // 5 6 7不试了，都差不多

    // 使用Servlet原生web资源 HttpServletRequest
    @RequestMapping(value="requestTest")
    public String requestTest(HttpServletRequest request) {
        User user = getUser();
        request.setAttribute("user", user);
        return "hello";
    }

    // 添加了ModelAttribute注解的方法，会在Spring MVC调用任何一个业务方法之前被自动调用
//    @ModelAttribute
//    public User getAttributeUser() {
//        User user = new User();
//        user.setId(1);
//        user.setName("王五");
//        return user;
//    }

    // 除了返回一个对象，还可以手动在该注解方法中使用Map或者Model填充模型数据
    @ModelAttribute
    public void getAttributeByMap(Map<String, Object> map) {
        User user = new User();
        user.setId(1);
        user.setName("小六");
        map.put("user", user);
    }
    @RequestMapping(value="modelAttributeTest")
    public String modelAttributeTest() {
        return "hello";
    }
}
