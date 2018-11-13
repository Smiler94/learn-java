package com.lz_java.controller;

import com.lz_java.annoation.MyController;
import com.lz_java.annoation.MyRequestMapping;

@MyController
@MyRequestMapping(value = "/testController")
public class TestController {

    @MyRequestMapping(value = "/test")
    public String test() {
        System.out.println("执行test相关业务");
        return "index";
    }
}
