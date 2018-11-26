package com.lz_java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class ConverterController {

    @RequestMapping(value="dateConverterTest")
    @ResponseBody
    public String dateConverterTest(Date date) {
        return date.toString();
    }
}
