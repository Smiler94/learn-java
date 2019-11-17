package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo03RandomGame {
    public static void main(String[] args) {
        int res = new Random().nextInt(100);
        int num = 0,time = 0;
        Scanner s = new Scanner(System.in);
        while(num != res) {
            System.out.println("请输入你猜的值:");
            num = s.nextInt();
            time ++;
            if (num > res) {
                System.out.println("你猜的值太大了!");
            } else if(num < res) {
                System.out.println("你猜的值太小了!");
            }
        }
        System.out.println("恭喜你猜对了!共猜了" + time + "次");
    }
}
