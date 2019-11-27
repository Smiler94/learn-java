package cn.itcast.day10.demo04;

/*
在多态的代码当中，成员方法的访问规则是
看new的是谁，就优先用谁，没有则向上找

注意：
成员方法：编译看左边，运行看右边
成员变量：编译看左边，运行看左边
 */
public class Demo04MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);
        obj.method(); // 父子都有，优先用子
        obj.methodFu(); // 子类没有，父类有，向上找到父类

        // 编译看左边，左边是Fu，Fu当中没有methodZi方法，所以编译报错
//        obj.methodZi(); // 错误写法

        // 向下转型
        System.out.println(obj instanceof Fu);
        Zi zi = (Zi) obj;
        System.out.println(zi.num);
        zi.methodZi();


    }
}
