package cn.itcast.day07.demo01;

import java.util.ArrayList;

/*
如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的包装类
基本类型  包装类(引用类型，包装类都位于java.lang包下)
byte   Byte
short  Short
int    Integer
long   Long
float   Float
double   Double
char    Character
boolean   Boolean

从JDK1.5开始，支持自动装箱，自动拆箱
自动装箱：基本类型自动变成包装类型
自动拆箱：包装类型自动变成基本类型
 */
public class Demo01ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        // 错误写法，泛型只能是引用类型，不能是基本类型
        // 因为ArrayList中存储的是地址值，基本类型没有地址值
        // ArrayList<int> listB = new ArrayList<int>();

        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(100);
        listB.add(299);
        System.out.println(listB);

        int num = listB.get(1);
        System.out.println("第一号位元素: " + num);
    }
}
