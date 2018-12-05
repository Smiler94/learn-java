package com.lz_java.solutions;

//设计一个算法，计算出n阶乘中尾部零的个数
//O(logN)的时间复杂度
public class NumOfZero {
    public static void main(String[] args) {
        int a = 25;
        int num = 0;
        while(a > 0) {
            num += a/5;
            a /= 5;
        }
        System.out.println(num);
    }
}
