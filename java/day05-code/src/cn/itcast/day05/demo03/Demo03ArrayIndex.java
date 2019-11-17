package cn.itcast.day05.demo03;

public class Demo03ArrayIndex {
    public static void main(String[] args) {
        int[] arrayA = {1,2,3};
        //ArrayIndexOutOfBoundsException 索引越界异常
        System.out.println(arrayA[3]);
    }
}
