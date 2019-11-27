package cn.itcast.day10.practise;

public class Board implements USB {

    @Override
    public void on() {
        System.out.println("键盘开启");
    }

    @Override
    public void off() {
        System.out.println("键盘关闭");
    }

    public void input() {
        System.out.println("键盘输入");
    }
}
