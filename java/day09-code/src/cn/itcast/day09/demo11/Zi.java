package cn.itcast.day09.demo11;

public class Zi extends Fu {

    public Zi() {
        System.out.println("子类构造方法");
    }

    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}
