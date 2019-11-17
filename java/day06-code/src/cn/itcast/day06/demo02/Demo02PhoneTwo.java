package cn.itcast.day06.demo02;

public class Demo02PhoneTwo {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "apple";
        one.price = 12.3;
        one.color = "white";

        System.out.println(one);
        Phone two = new Phone();
        two.brand = "三星";
        two.price = 5593;
        two.color = "black";

        System.out.println(two);
    }
}
