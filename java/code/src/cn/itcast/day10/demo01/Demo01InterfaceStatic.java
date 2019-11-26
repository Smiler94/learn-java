package cn.itcast.day10.demo01;

/*
注意：不能通过接口实现类的对象来调用接口当中的静态方法
正确用法：通过接口名称，直接调用静态方法
 */
public class Demo01InterfaceStatic {
    public static void main(String[] args) {
        // 创建了实现类对象
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        // 错误写法
//        impl.methodStatic();

        // 直接通过接口名称调用
        MyInterfaceStatic.methodStatic();
    }
}
