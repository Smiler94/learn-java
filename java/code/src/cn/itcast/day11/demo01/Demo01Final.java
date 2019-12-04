package cn.itcast.day11.demo01;

/*
final关键字代表最终、不可改变的

常见四种用法：
1. 可以用来修饰一个类
2. 可以用来修饰一个方法
3. 可以用来修饰一个局部变量
4. 可以用来修饰一个成员变量
 */
public class Demo01Final {
    public static void main(String[] args) {
        // 一旦使用final修饰局部变量，那么这个变量就不能进行更改

        final int num = 10;
//        num = 29;
    }
}
