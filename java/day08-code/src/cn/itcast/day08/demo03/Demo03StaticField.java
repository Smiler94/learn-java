package cn.itcast.day08.demo03;

/*

 */
public class Demo03StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭靖", 19);
        Student two = new Student("黄蓉", 16);
        one.room = "101 room";
        System.out.println("id: " + one.getId()
                + ", name: "+ one.getName()
                + ", age: " + one.getAge()
                + ", room: " + one.room);
        System.out.println("id: " + two.getId()
                + ", name: "+two.getName()
                + ", age: " + two.getAge()
                + ", room: " + two.room);
    }
}
