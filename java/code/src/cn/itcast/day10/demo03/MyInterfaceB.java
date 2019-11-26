package cn.itcast.day10.demo03;

public interface MyInterfaceB {
    public abstract void methodB();

    public default void methodDefault() {
        System.out.println("接口B的默认方法");
    }
}
