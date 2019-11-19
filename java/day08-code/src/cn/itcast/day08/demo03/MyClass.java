package cn.itcast.day08.demo03;

public class MyClass {

    int num;
    static int numStatic;

    public void method() {
        System.out.println("this is a common method");

        // member method can use both member variable and static variable
        System.out.println(num);
        System.out.println(numStatic);
    }

    public static void methodStatic() {
        System.out.println("this is a static method");

        // static method can only use static variable
//        System.out.println(num);
        System.out.println(numStatic);

    }
}
