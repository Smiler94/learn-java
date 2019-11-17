package cn.itcast.day05.demo03;

public class Demo03ArrayNull {
    public static void main(String[] args) {
        int[] arrayA = null;

        // NullPointerException 空指针异常
        System.out.println(arrayA[0]);
    }
}
