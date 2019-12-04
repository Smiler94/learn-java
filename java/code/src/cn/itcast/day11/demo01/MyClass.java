package cn.itcast.day11.demo01;

/*
当final关键字用来修饰一个类时

public final class 类名称 {
   // ...
}

含义：当前这个类不能有任何的子类。 太监类
 */
public final class MyClass {

    public void method() {
        System.out.println("方法执行");
    }
}
