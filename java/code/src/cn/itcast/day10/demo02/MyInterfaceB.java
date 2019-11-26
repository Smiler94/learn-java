package cn.itcast.day10.demo02;

public interface MyInterfaceB {

    // 错误写法，接口不能有静态代码块
//    static {
//
//    }

    // 错误写法，接口不能有构造函数
//    public MyInterface() {
//
//    }
    void methodB();

    void methodAbs();

    default void methodDefault() {
        System.out.println("接口B的默认方法");
    }
}
