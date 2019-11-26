package cn.itcast.day10.demo02;

public interface MyInterfaceA {

    // 错误写法，接口不能有静态代码块
//    static {
//
//    }

    // 错误写法，接口不能有构造函数
//    public MyInterface() {
//
//    }

    void methodA();

    void methodAbs(int num);

    default void methodDefault() {
        System.out.println("接口A的默认方法");
    }
}
