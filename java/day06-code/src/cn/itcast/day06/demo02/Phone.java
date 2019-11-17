package cn.itcast.day06.demo02;

/*
定义一个类，用来模拟 手机

属性：品牌、加个、颜色
行为：打电话、发短信

 */
public class Phone {
    public String brand; //品牌
    public double price; //价格
    public String color; //颜色

    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }

    public void sendMessage() {
        System.out.println("群发短信");
    }

    public String toString() {
        return brand + " " + price + " " + color;
    }
}
