package cn.itcast.day08.demo03;

public class Demo01StaticStudent {
    public static void main(String[] args) {
        Student.room = "101room";

        Student one = new Student("郭靖", 19);
        System.out.println("id: " + one.getId()
                + ", name: "+ one.getName()
                + ", age: " + one.getAge()
                + ", room: " + Student.room);

        Student two = new Student("黄蓉", 16);
        System.out.println("id: " + two.getId()
                + ", name: "+ two.getName()
                + ", age: " + two.getAge()
                + ", room: " + Student.room);
    }
}
