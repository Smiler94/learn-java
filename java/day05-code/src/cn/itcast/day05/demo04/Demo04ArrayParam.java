package cn.itcast.day05.demo04;

/*
数组可以作为方法的参数
当调用方法的时候，想方法的小括号进行传参，传递进去的实际是数组的地址
 */
public class Demo04ArrayParam {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50};

        printArray(array);
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
