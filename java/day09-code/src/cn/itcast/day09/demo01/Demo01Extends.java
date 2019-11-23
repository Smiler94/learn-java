package cn.itcast.day09.demo01;

/*
in the relationship of extends, child is a "parent"
ex:
Teacher extends Employee
so a teacher is an employee
 */
public class Demo01Extends {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        // although there is no method in class Teacher, but it extends the method from Employee
        teacher.method();

        Assistant assistant = new Assistant();
        assistant.method();
    }
}
