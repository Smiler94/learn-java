package cn.itcast.day10.demo02;

/*
使用接口的时候，需要注意：
1. 接口是没有静态代码块或者是构造方法的
2. 一个雷的直接父类是唯一的，但是一个类可以同时实现多个接口
public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {

}
3. 如果实现类所实现的多个接口当中，存在重复的抽象方法，只需要实现一个即可
4. 如果实现类没有覆盖重写所有接口当中的所有抽象方法，那么这个类也必须是一个抽象类
5. 如果实现类实现的多个接口当中，存在重复的默认方法
6. 一个类如果直接父类当中的方法和接口当中的默认方法，产生了冲突，优先用父类当中的方法
 */
public class Demo02Interface {
}
