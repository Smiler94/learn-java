package cn.itcast.day10.demo03;

public interface MyInterfaceA {
    public abstract void methodA();

    public default void methodDefault() {
        System.out.println("接口A的默认方法");
    }
}
