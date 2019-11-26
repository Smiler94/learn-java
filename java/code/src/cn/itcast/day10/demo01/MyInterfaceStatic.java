package cn.itcast.day10.demo01;

/*
从java8开始，接口当中允许定义静态方法

public static 返回值类型 方法名称(参数名称) {
    方法体
}
 */
public interface MyInterfaceStatic {

    public static void methodStatic() {
        System.out.println("这是接口的静态方法");
    }
}
