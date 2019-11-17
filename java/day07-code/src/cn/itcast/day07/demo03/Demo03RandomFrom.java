package cn.itcast.day07.demo03;

import java.util.Random;

/*
根据 int 变量 n 的值，来获取随机数字，范围是[1,n]，可以去到 1 也可以取到 n
 */
public class Demo03RandomFrom {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();

        int res = r.nextInt(n) + 1;
        System.out.println("结果值为："+res);
    }
}
