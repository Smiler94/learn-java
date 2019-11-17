package cn.itcast.day05.demo03;

/*
数组元素的反转
本来的样子：[1, 2, 3, 4]
现在的样子：[4, 3, 2, 1]
 */
public class Demo03ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        //遍历打印原来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int temp = 0;
        int len = array.length;
        for (int i = 0; i < len/2 ; i++) {
            temp = array[i];
            array[i] = array[len-1-i];
            array[len-1-i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
