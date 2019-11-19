package cn.itcast.day08.practise.math;

/*
题目
计算在-10.8 到 5.9 之间，绝对值大于6 或者小于2.1的整数有多少个
 */
public class PractiseMath {
    public static void main(String[] args) {
        int start = -10;
        int end = 5;
        int count = 0;
        for(int i = start;i <= end;i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
