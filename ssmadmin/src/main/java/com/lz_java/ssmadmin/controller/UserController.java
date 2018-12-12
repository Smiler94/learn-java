package com.lz_java.ssmadmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
