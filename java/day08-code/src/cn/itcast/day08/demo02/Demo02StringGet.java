package cn.itcast.day08.demo02;

/*
String 当中与获取相关的常用方法

public int length(); 获取字符串当中含有的字符个数，即字符串长度
public String concat(String str); 拼接字符串
public char charAt(int index); 获取指定索引位置的单个字符
public int indexOf(String str); 查找参数字符串在本字符串当中首次出现的索引位置，如果没有，返回-1

 */
public class Demo02StringGet {
    public static void main(String[] args) {
        // 获取字符串长度
        String str = "asdfasdfasdfasdfasdf";
        int length = str.length();
        System.out.println("字符串长度为：" + length);

        // 拼接字符串
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str1); // hello
        System.out.println("合并后的字符串为：" + str3);

        // 获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是：" + ch);

        // 获取某个字符串在当前字符串出现的索引位置
        int position = "Hello world".indexOf("o");
        System.out.println("位置为：" + position);
        System.out.println("找不到时结果为：" + "hello".indexOf("sdfa"));
    }
}
