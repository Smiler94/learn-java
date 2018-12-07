package com.lz_java.solutions;

//合并两个排序的整数数组A和B变成一个新的数组。
//给出A=[1,2,3,4]，B=[2,4,5,6]，返回 [1,2,2,3,4,4,5,6]

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {2,4,5,6};
        int al = a.length-1;
        int bl = b.length-1;
        a = Arrays.copyOf(a, a.length + b.length);
        int k = a.length-1;
        while(al >= 0 && bl >= 0) {
            if (a[al] >= b[bl]) {
                a[k--] = a[al--];
            } else {
                a[k--] = b[bl--];
            }
        }
        while(bl >= 0) {
            a[k--] = b[bl--];
        }
        for(int i : a) {
            System.out.println(i);
        }
    }
}
