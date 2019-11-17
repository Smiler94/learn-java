package cn.itcast.day07.practice;

import java.util.ArrayList;

/*
定义以指定格式打印集合的方法，使用{}扩起集合，使用@分隔每个元素
 */
public class PracArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("VN");
        list.add("女警");
        list.add("阿狸");
        printArrayList(list);
    }

    private static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + "@");
            } else {
                System.out.print(list.get(i) + "}");
            }
        }
//        System.out.print("}");
    }
}
