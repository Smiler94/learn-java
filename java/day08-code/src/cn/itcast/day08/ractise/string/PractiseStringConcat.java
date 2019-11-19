package cn.itcast.day08.ractise.string;

/*
题目：
定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串，格式参数如下{word1#word2#word3}
 */
public class PractiseStringConcat {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        String str = formatString(array);
        System.out.println(str);
    }

    private static String formatString(int[] array) {
        String str = "{";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str = str.concat("word" + array[i] +"}");
            } else {
                str = str.concat("word" + array[i] +"#");
            }

        }
        return str;
    }
}
