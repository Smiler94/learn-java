package cn.itcast.day08.demo03;

/*
once a method is defined statically
the method is belong to class but not object

if you want to use a static method
it is not necessary to create an object
 */
public class Demo03StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        // use method without static keyword
        obj.method();

        // use object or class name
        obj.methodStatic(); // not recommend
        MyClass.methodStatic();

        // ignore the class name
        myMethod();
    }

    public static void myMethod() {
        System.out.println("self method");
    }
}
