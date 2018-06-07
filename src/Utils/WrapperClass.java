package Utils;

public class WrapperClass {
    // Java语言是一个面向对象的语言，但是Java中的基本数据类型却是不面向对象的，
    // 这在实际使用时存在很多的不便，为了解决这个不足，
    // 在设计类时为每个基本数据类型设计了一个对应的类进行代表，
    // 这样八个和基本数据类型对应的类统称为包装类(Wrapper Class)，有些地方也翻译为外覆类或数据类型类。
    public static void main(String args[]) {
        // 只以 int 为例

        Integer in = 10; // 等价于 Integer in = new Integer(10)
        System.out.println("value of in is : " + in);

        WrapperClass wc = new WrapperClass();
        wc.parse();
    }
    
    private void parse() {
        String s = "123";
        int n = Integer.parseInt(s);
        System.out.println("value of n is "+n);

        String ss = "12";
        // 将 radix 进制的值转为10进制
        int nn = Integer.parseInt(ss, 16); // 第二个参数为进制
        System.out.println("16进制中的" + ss + "在10进制中为"+nn);
    }
}
