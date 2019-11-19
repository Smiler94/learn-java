package cn.itcast.day08.practise.arrays;

import java.util.Arrays;

/*
题目：
使用Arrays相关的API，将一个随机字符串的所有字符升序排列，并倒序打印
 */
public class PractiseArraysSort {
    public static void main(String[] args) {
        String str = "asdfasdfasdfasdfasd";
        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);
//        for (int i = 0; i < charArray.length; i++) {
//            System.out.println(charArray[charArray.length-i-1]);
//        }\
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.println(charArray[i]);
        }
    }
}
