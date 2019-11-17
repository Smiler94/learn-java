package cn.itcast.day07.demo01;

import java.util.Scanner; // 1. 导包
/*
Scanner类的功能，可以实现键盘输入数据到程序当中

引用类型的一般使用步骤
1. 导包
import 包路径.类名称;
如果需要使用的目标类，和当前类位于同一个包下，可以省略导包语句不写
只有 java.lang包下的类不需要导包，其他的包都需要 import
2. 创建
3. 使用

获取键盘输入的一个数字 sc.nextInt()
获取键盘输入的一个字符串 sc.next();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        // System.in代表从键盘输入
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("输入的数字是：" + num);
    }
}
