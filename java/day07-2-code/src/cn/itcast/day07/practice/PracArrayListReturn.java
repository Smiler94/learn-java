package cn.itcast.day07.practice;

import java.util.ArrayList;
import java.util.Random;

/*
用一个大集合存入20个随机数，然后筛选出其中的偶数元素，放到小集合当中
 */
public class PracArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100);
            list.add(num);
        }
        System.out.println(list);
        ArrayList<Integer> evenList = filterArray(list);
        System.out.println(evenList);
    }

    private static ArrayList<Integer> filterArray(ArrayList<Integer> list) {
        ArrayList<Integer> evenList = new ArrayList<>();

        for (Integer integer : list) {
            if (integer % 2 ==0) {
                evenList.add(integer);
            }
        }
        return evenList;
    }
}
