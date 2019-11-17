package cn.itcast.day05.demo04;

/*
一个方法可以有0、1、多个参数，但是只能有 0 或者 1 个返回值，不能有多个返回值
如果希望一个方法当中缠身改了多个结果数据进行返回，怎么办
解决方案：使用一个数组作为返回值
 */
public class Demo04ArrayReturn {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int[] result = calculate(a, b, c);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b +c;
        int avg = sum/3;
        int[] array ={sum, avg};
        return array;
    }
}
