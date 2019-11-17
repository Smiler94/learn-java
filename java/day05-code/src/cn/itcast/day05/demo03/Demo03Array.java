package cn.itcast.day05.demo03;

public class Demo03Array {
    public static void main(String[] args) {
        int[] array = { 15, 25, 35, 45, 50 };

        // 使用循环输出
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("===================");
        int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }
    }
}
