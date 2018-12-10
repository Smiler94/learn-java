package com.lz_java.solutions;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcdefg";
        char[] cs = s.toCharArray();
        int offset = 2;
        int start = 0;
        char tmp = cs[5];
        int next = 2;
        while(next != start) {
            cs[next] = tmp;
            next = next<offset ? cs.length-offset+next : next-offset;
            tmp = cs[next];
        }
        System.out.println(cs);
    }
}
