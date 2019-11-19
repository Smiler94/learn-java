package cn.itcast.day08.demo03;

/*
static code:

public class MyClass {
    static {
        // static code content
    }
}

remark: the static code block will run only once when the class firstly used

usage: initialize the static variable
*/
public class Person {
    static {
        System.out.println("static code block running");
    }

    public Person() {
        System.out.println("construct running");
    }
}
