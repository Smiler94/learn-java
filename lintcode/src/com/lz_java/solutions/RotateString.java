package com.lz_java.solutions;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcdef";
        char[] str = s.toCharArray();
        int offset = 3;
//        offset = offset % str.length;
//        char tmp2=str[0],tmp;
//        int next = 0;
//        do {
//            tmp = tmp2;
//            next = next<str.length-offset ? next+offset : next+offset-str.length;
//            System.out.println(next);
//            tmp2 = str[next];
//            str[next] = tmp;
//        }while(next != 0);
//        System.out.println(str);
    }
}
