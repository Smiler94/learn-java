package com.lz_java.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OutputMain {
    public static void main(String[] args) {
        // 方式1
        // 直接调用
//        IOutputGenerator output = new CsvOutputGenerator();
//
//        output.generateOutput();

        // 方式2
        // 通过辅助类
//        OutputHelper output = new OutputHelper();
//        output.generateOutput();

        // 方式3
        // spring 依赖注入DI
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        OutputContainer output = (OutputContainer) ctx.getBean("outputHelper");
        output.generateOutput();
        // 只需要改变 Spring XML 文件使用不同的输出生成器。只修改 Spring XML 文件而不需要无码修改，这意味着更少的错误。
    }
}
