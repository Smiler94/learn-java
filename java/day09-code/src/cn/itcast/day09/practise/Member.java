package cn.itcast.day09.practise;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {

    }

    public Member(String name, int totalMoney) {
        super(name, totalMoney);
    }

    public void receive(ArrayList<Integer> list) {
        // 从多个红包当中随便抽取一个，给自己
        // 随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
        // 根据索引，从集合当中删除
        int delta = list.remove(index);

        super.setTotalMoney(super.getTotalMoney() + delta);
    }
}
