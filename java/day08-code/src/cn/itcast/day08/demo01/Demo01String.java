package cn.itcast.day08.demo01;

/*
java.lang.String 类代表字符串
程序当中给所有的双引号字符串，都是 String 类的实例

字符串的特点：
1. 字符串的内容永不可变
2. 正是因为字符串不可改变，所以字符串是可以共享使用的
3. 字符串效果上相当于是 char[] 字符数组，但是底层原理是 byte[] 字节数组

创建字符串的3+1种方法：
三种构造方法：
public String(); 创建一个空白字符串，不包含有任何内容
public String(char[] array); 根据字符数组的内容来创建对应的字符串
public String(byte[] bytes); 根据字节数组的内容，来创建对应的字符串
一种直接创建
String str = "Hello"; 直接用双引号
注意：直接写双引号，也是字符串对象
 */
public class Demo01String {
    public static void main(String[] args) {
        // 使用空惨构造
        String str1 = new String();
        System.out.println("第一个字符串是：" + str1);

        // 根据字符数组创建字符串
        char[] charArray = { 'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串是：" + str2);

        //  根据字节数组创建字符串
        byte[] byteArray = { 97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串是：" + str3);

        // 直接创建
        String str4 = "hello";
        System.out.println("第四个字符串是：" + str4);
    }
}
