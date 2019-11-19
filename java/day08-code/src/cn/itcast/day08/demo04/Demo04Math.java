package cn.itcast.day08.demo04;

/*
java.util.Math is a util class about math

// get absolute value
public static double abs(double num)

// get ceil integer
public static double ceil(double num)

// get floor integer
public static double floor(double num)

// get rounding
public static long round(double num)

Math.PI  circular constant
 */
public class Demo04Math {
    public static void main(String[] args) {
        // absolute
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(-3.14));

        // ceil
        System.out.println(Math.ceil(3.14));

        // floor
        System.out.println(Math.floor(3.14));

        // rounding
        System.out.println(Math.round(3.14));

        // PI
        System.out.println(Math.PI);
    }
}
