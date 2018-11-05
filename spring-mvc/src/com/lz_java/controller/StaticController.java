package com.lz_java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaticController {
    @RequestMapping(value="/static", method= RequestMethod.GET)
    public String index()
    {
        return "redirect:/pages/final.html";
    }
}
