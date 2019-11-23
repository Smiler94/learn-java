package cn.itcast.day09.demo04;

/*
在父子类的继承关系当中，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就优先用谁，如果没有则向上找

重写（Override）也叫覆盖、覆写
在继承关系当中，方法的名称一样，参数列表也一样

重载（Overload）
方法的名称一样，参数列表不一样

方法的覆盖重写特点:创建的是子类对象，则优先用子类方法
 */
public class Demo04ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }
}
