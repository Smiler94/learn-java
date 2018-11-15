package com.lz_java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }

    @RequestMapping(value="testParam", params={"name", "id=10"})
    public String testParam(ModelMap model) {
        model.addAttribute("message", "test param");
        return "hello";
    }

    @RequestMapping(value="paramBind")
    public String paramBind(@RequestParam("name") String name, @RequestParam("id") int id, ModelMap model) {
        model.addAttribute("message", name + ',' + id);
        return "hello";
    }
}
