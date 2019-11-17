package cn.itcast.day07.practice;

import java.util.ArrayList;

/*
自定义4个学生对象，添加到集合，并遍历
 */
public class PracArrayListObject {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Student s = new Student("学生" + i, i+10);
            list.add(s);
        }

        for (Student student : list) {
            System.out.println(student.getName() + "," + student.getAge());
        }
    }
}
