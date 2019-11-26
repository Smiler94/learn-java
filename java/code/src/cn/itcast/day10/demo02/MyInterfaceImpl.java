package cn.itcast.day10.demo02;

public class MyInterfaceImpl /*extends Object*/ implements MyInterfaceA, MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("实现了A接口");
    }

    @Override
    public void methodAbs(int num) {
        System.out.println("覆盖了A接口的有参方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("覆盖了AB接口中相同的默认方法");
    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖了B接口的无参方法");
    }

    @Override
    public void methodB() {
        System.out.println("实现了B接口");
    }


}
