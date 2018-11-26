package com.lz_java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value="baseType")
    @ResponseBody //改注解直接返回字符串到前端，不需要返回jsp页面
    public String baseType(int id) { // 基本类型，不填会报502，因为基本类型不能赋值为null
        return "id:" +id;
    }

    @RequestMapping(value="packageType")
    @ResponseBody
    public String packageType(Integer id) { // 包装类型，不填不会报502，因为包装类型可以赋值为null
        return "id:" + id;
    }

    @RequestMapping(value="requestParam")
    @ResponseBody
    // RequestParam注解，对参数进行相关设置
    // value="id"：将 HTTP 请求中名为 id 的参数与形参进行映射
    // required=false：id 参数非必填，可省略
    // defaultValue="1"：若 HTTP 请求中没有 id 参数，默认值为 1
    public String requestParam(@RequestParam(value="id",required = false,defaultValue="1") Integer id) {
        return "id:" + id;
    }

    @RequestMapping(value="arrayType")
    @ResponseBody
    public String arrayType(String[] name) {
        StringBuffer sbf = new StringBuffer();

        for(String item:name) {
            sbf.append(item).append(" ");
        }
        return "name:" + sbf;
    }
}
