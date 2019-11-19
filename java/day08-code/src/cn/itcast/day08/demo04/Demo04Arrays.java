package cn.itcast.day08.demo04;

import java.util.Arrays;

/*
java.util.Array is a util class about array which provide a lot of static method
to operate array

// convert an array to string by default format [ele1, ele2, ele3..]
public static String toString(array);

// sort array by asc default
public static void sort(array)

 */
public class Demo04Arrays {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {2, 1, 4, 5, 10};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"bbb", "abb", "aaa"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
