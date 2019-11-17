package cn.itcast.day05.demo03;

/*
获取数组的长度
数组名称.length

数组一旦创建，程序运行期间，长度不可改变
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10,20,304,123,123,12,31,232,3123};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度为" + len);
        System.out.println("=====================");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
