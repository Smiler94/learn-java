package com.lz_java.solutions;

public class NumCount {
    public static void main(String args[]) {
        int n = 10;
        int k = 1;
        char ks = (char) (k+48);
        int count = 0;
        for(int i = 0;i<= n;i++) {
            String s = Integer.toString(i);
            for(char sj:s.toCharArray()) {
                if (sj == ks) count++;
            }
        }
        System.out.println(count);
    }
}
