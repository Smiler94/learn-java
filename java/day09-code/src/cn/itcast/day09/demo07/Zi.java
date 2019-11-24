package cn.itcast.day09.demo07;

public class Zi extends Fu {

    public Zi() {
        super(1);
        System.out.println("子类构造方法");
    }

    public void method() {
//        super();   只有子类构造方法，才能调用父类构造方法
    }
}
