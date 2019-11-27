package cn.itcast.day10.practise;

public class Mouse implements USB {
    @Override
    public void on() {
        System.out.println("鼠标开启");
    }

    @Override
    public void off() {
        System.out.println("鼠标关闭");
    }

    public void click() {
        System.out.println("鼠标点击");
    }
}
