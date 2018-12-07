package com.lz_java.solutions;

public class ReverseInt {
    public static void main(String args[]) {
        int a = 321;

        System.out.println(a%10*100 + (a/10)%10*10 + a/100);
    }
}
