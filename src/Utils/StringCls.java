package Utils;

public class StringCls {
    //字符串广泛应用 在Java 编程中，在 Java 中字符串属于对象，Java 提供了 String 类来创建和操作字符串。
    public static void main(String args[]) {
        char[] helloArray = {'r', 'u', 'n', 'o', 'o','b'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        StringCls sc = new StringCls();
        sc.stringLen();
        sc.concat();
        sc.format();
        sc.preg();
    }

    private void stringLen() {
        String s = "hello world";
        System.out.println("The length of s is "+s.length());
    }

    private void concat() {
        String s1 = "hello ";
        String s2 = "world!";
        // 连接字符串，可以使用 concat 方法，不过更长使用'+'操作符
        System.out.println("concat s1 with s2 : " + s1.concat(s2));
    }

    private void format() {
        Double floatVar = 1.23;
        Integer intVar = 100;
        String strVar = "hello";
        String fs;

        fs = String.format("the float is %f,the integer is %d,the string is %s", floatVar, intVar, strVar);
        System.out.println(fs);
    }

    private void preg() {
        String sf = "hello world";

        System.out.println(sf.matches(".+world"));
    }
}
