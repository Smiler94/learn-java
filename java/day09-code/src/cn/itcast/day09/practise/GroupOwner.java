package cn.itcast.day09.practise;

import java.util.ArrayList;

public class GroupOwner extends User{

    public GroupOwner() {

    }

    public GroupOwner(String name, int totalMoney) {
        super(name, totalMoney);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> redList = new ArrayList<>();

        // 首先看一下群主有多少钱
        int leftMoney = super.getTotalMoney();
        if (totalMoney > leftMoney) {
            System.out.println("余额不足");
            return redList;
        }

        // 扣钱，其实就是重新设置余额
        super.setTotalMoney(leftMoney - totalMoney);

        // 发红包需要平均拆分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count; // 余数，也就是甩下的领头
        // 除不开的领头，把它包在最后一个红包当中
        // 下面把红包一个一个放到集合当中
        for (int i = 0; i < count; i++) {
            if (i == count-1) {
                redList.add(avg + mod);
            } else {
                redList.add(avg);
            }
        }

        return redList;
    }
}
