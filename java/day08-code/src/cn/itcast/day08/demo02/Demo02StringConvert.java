package cn.itcast.day08.demo02;

/*
the usually methods of convert

// split the String to char array and return
public char[] toCharArray();

// get the bytes array of the string
public byte[] getBytes();

// replace the old string to the new string
public String replace(CharSequence oldString, CharSequence newString)
remark: CharSequence is an interface, means able to receive a String
 */
public class Demo02StringConvert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]); // H
        System.out.println(chars.length); // 5

        // convert to bytes array
        byte[] bytes = "abc".getBytes();
//        System.out.println(bytes[0]);
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String str1 = "how do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);// How do you do?
        System.out.println(str2);// H* d* you d*?
    }
}
