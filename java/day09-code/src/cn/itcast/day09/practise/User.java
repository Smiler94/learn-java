package cn.itcast.day09.practise;

public class User {

    private String name;

    private int totalMoney;

    public User() {

    }

    public User(String name, int totalMoney) {
        this.name = name;
        this.totalMoney = totalMoney;
    }

    // 展示一下当前用户有多少钱
    public void show() {
        System.out.println("我叫：" + name + "，我有多少钱：" + totalMoney);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }
}
