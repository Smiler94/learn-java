package com.lz_java.solutions;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcdefg";
        char[] cs = s.toCharArray();
        int offset = 2;
        int start = 0;
        char tmp = cs[start];
        int next = 5;
        // fgabcde
        while(next != start) {
            cs[next] = tmp;
            start = start<offset ? cs.length-offset+start : start-offset;
            System.out.println(start);
//            tmp = cs[start];
//            next = start<cs.length-offset ? start+offset : start+offset-cs.length;
        }
        System.out.println(cs);
    }
}
