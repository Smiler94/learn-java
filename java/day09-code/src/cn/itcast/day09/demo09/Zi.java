package cn.itcast.day09.demo09;

/*
super关键字用来访问父类内容，而this关键字用来访问本类内容，用法也有三种：

1. 在本类的成员方法中，访问本类的成员变量
2. 在本类的成员方法中，访问本类的另外一个成员方法
3. 在本类的构造方法中，访问本类的另外一个构造方法
在第三种用法当中要注意：
A this(...)调用也必须是构造方法的第一个语句
B super和this两种构造调用，不能同时使用
 */
public class Zi extends Fu {

    int num = 20;

    public Zi() {
        this(1); // 本类的无参构造，调用本类的有参构造
//        this(1, 2); // 不允许
    }

    public Zi(int n) {

    }
    public Zi(int n, int num) {

    }

    public void showNum() {
        int num = 10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

    public void  methodA() {
        System.out.println("aaaa");
    }

    public void methodB() {
        this.methodA();
        System.out.println("bbbb");
    }
}
