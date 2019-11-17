package cn.itcast.day07.demo01;

import java.util.ArrayList;

public class Demo01ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("!!!");

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
