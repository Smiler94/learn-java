package cn.itcast.day09.practise;

import java.util.ArrayList;

public class Practise01Red {
    public static void main(String[] args) {
        GroupOwner groupOwner = new GroupOwner("群主", 100);
        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);

        groupOwner.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==========================");

        ArrayList<Integer> redList = groupOwner.send(50, 3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        groupOwner.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==========================");
    }
}
