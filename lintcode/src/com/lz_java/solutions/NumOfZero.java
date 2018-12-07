package com.lz_java.solutions;

//设计一个算法，计算出n阶乘中尾部零的个数
//O(logN)的时间复杂度
public class NumOfZero {
    public static void main(String[] args) {
        int a = 25;
        int num = 0;
        int b;
        while(a > 0) {
            a = a/5;
            num += a;
        }
        System.out.println(num);
    }
}
