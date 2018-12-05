package com.lz_java.solutions;

//给出两个整数 aa 和 bb , 求他们的和。
//不使用+等算数运算符
public class SumTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c;
        while(b != 0) {
            c = a;
            a = a ^ b;
            b = (c & b) << 1;
        }
        System.out.println(a);
    }
}
