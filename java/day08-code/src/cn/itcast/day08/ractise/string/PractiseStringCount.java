package cn.itcast.day08.ractise.string;

import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计其中各种字符串出现的次数
种类有：大写字母，小写字母，数字，其他
 */
public class PractiseStringCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        byte[] bytes = input.getBytes();
        int upper = 0,lower = 0, number = 0, other = 0;
        for (int i = 0; i < bytes.length; i++) {
            byte c = bytes[i];
            if (c >= 48 && c <= 57) {
                number ++;
            } else if(c >= 97 && c <= 122) {
                lower ++;
            } else  if(c >= 65 && c <= 90) {
                upper ++;
            } else {
                other ++;
            }
        }
        System.out.println("the count of upper is:" + upper);
        System.out.println("the count of lower is:" + lower);
        System.out.println("the count of number is:" + number);
        System.out.println("the count of other is:" + other);
    }
}
