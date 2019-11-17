package cn.itcast.day07.demo01;

/*
定义个数组，用来存储三个Person对象
 */
public class Demo01Array {
    public static void main(String[] args) {
        // 首先创建一个长度为3的住宿，里面用来存放Person类型的对象
        Person[] array = new Person[3];
        System.out.println(array[0]);

        Person one = new Person("迪丽热巴", 14);
        Person two = new Person("古力娜扎",20);
        Person three = new Person("马尔扎哈", 38);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        for (Person person : array) {
            System.out.println(person );
        }
    }
}
