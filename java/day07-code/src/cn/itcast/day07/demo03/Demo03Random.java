package cn.itcast.day07.demo03;

import java.util.Random;

/*
用来生成随机数字，导包、创建、使用三步骤
 */
public class Demo03Random {
    public static void main(String[] args) {
        // 随机范围为 int， -21亿到+21亿
        Random r = new Random();
        int i = r.nextInt();
        System.out.println("生成的随机数为：" + i);

        // 范围为[0,10)
        int n = r.nextInt(10);
        System.out.println("生成的随机数为：" + n);
    }
}
