package cn.itcast.day08.demo02;

/*
字符串的截取方法：

public String substring(int index); sub from the param to the end of the string, then return the new string
public String substring(int begin, int end); return string between begin to end
remark：[begin, end) include left and without right
 */
public class Demo02StringSub {
    public static void main(String[] args) {
        String str1 = "Helloworld";
        String str2 = str1.substring(5);
        System.out.println(str1); // Helloworld
        System.out.println(str2); // world

        String str3 = str1.substring(4, 7);
        System.out.println(str3); // owo

        // the content of 'strA' is never change
        // there are 2 strings, "Hello" and "Java"
        // strA saved the address value
        String strA = "Hello";
        System.out.println(strA); // Hello
        strA = "java"; // when this code run, the strA save 0x999 instead of 0x666
        System.out.println(strA); // Java
    }
}
