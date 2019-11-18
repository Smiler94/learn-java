package cn.itcast.day08.demo02;

/*
== 是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法

public boolean equals(Object obj) 参数可以是任何对象，只有参数是一个字符串并且内容相同才会返回true，否则返回false
注意事项：
1. 任何对象都用Object进行接收
2. equals方法具有对称性，a.equals(b)和b.equals(a)效果一样
3. 如果比较双方一个常量一个变量，推荐把常量字符串写在前面
推荐："abc".equals(str)  不推荐str.equals("abc")

public boolean equalsIgnoreCase(String str); 忽略大小 进行内容比较
 */
public class Demo02StringEquals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] charArray = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("hello"));
        System.out.println("hello".equals(str1));

        String str4 = "Hello";
        System.out.println(str1.equals(str4));

        String str5 = "abc";
        // 若str5是一个null，则第一种写法不会报错，会返回false
        // 第二种写法则会报空指针异常
        System.out.println("abc".equals(str5));
        System.out.println(str5.equals("abc"));

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB)); // 严格比较大小写
        // 注意：只有英文字母区分大小写，其他都不区分大小写
        System.out.println(strA.equalsIgnoreCase(strB));// 忽略大小写
    }
}
