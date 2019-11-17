package cn.itcast.day05.demo01;

/*
使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值
如果是整数类型，默认为 0
如果是浮点类型，默认为 0.0
如果是字符类型，默认为'\u0000'
如果是布尔类型，默认为 false
如果是引用类型，默认为 null
 */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        // 动态初始化一个数组
        int[] array = new int[3];
        System.out.println(array);
        System.out.println(array[0]);

        array[1] = 123;
        System.out.println(array[1]);
    }
}
