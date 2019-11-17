package cn.itcast.day07.demo01;

import java.util.ArrayList;

/*
ArrayList当中的常用方法：

public boolean add(E e); 向集合当中添加元素，参数的类型与泛型一致
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用

public E get(int index); 从集合当中读取元素，参数是索引编号，返回值是对应位置的元素
public E remove(int index); 从集合当中删除元素，参数是索引编号，返回值是被删除的元素
public int size(); 获取集合的长度，返回值是集合中包含的元素个数

 */
public class Demo01ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        boolean res = list.add("hello");
        System.out.println("添加结果为:" + res);
        list.add("world");

        String first = list.get(0);
        System.out.println("第0个元素为：" + first);

        String removeFirst = list.remove(0);
        System.out.println("被删除的元素为: " + removeFirst);

        int size = list.size();
        System.out.println("目前集合的长度为：" + size);
    }
}
