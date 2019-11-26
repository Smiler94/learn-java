package cn.itcast.day10.demo01;

public class Demo01InterfaceDefault {
    public static void main(String[] args) {
        MyInterfaceDefaultA myInterfaceDefaultA = new MyInterfaceDefaultA();

        // 调用抽象方法
        myInterfaceDefaultA.methodAbs();
        // 调用默认方法
        myInterfaceDefaultA.methodDefault();
    }
}
