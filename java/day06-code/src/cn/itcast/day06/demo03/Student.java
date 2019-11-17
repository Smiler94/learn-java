package cn.itcast.day06.demo03;

/*
一个标准的类通常要拥有下面四个组成部分

1. 所有的成变量都要使用 private 关键字
2. 为每一个成员变量编写一对 getter/setter
3. 一个无参数的构造方法
4. 一个全参数的构造方法

这样标准的类也叫做 Java Bean
 */
public class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
