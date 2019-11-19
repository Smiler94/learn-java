package cn.itcast.day08.demo02;

/*
split methods:

// split String to multi parts
public String[] split(String regex);
remark: the param of split is a regex expression

 */
public class Demo02StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc,d";
        String[] strArray = str1.split(",");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        String str3 = "XXX.YYY.ZZZ";
//        String[] array3 = str3.split(".");
        // if want to split successfully, "." should be instead of "\\."        System.out.println(array3.length);
        String[] array3 = str3.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
