package cn.itcast.day05.demo01;

/*
 静态初始化的省略格式

 数据类型[] 数组名称 = {元素1, 元素2}

 注意事项：
 1. 静态初始化没有直接指定长度，但是仍然会自动推算出长度
 2. 静态初始化标准格式可以拆分成两个步骤
 3. 动态初始化也可以拆分成两个步骤
 4. 静态初始胡啊一旦使用省略格式，就不能拆分成两个步骤了

 使用建议
 如果不确定数组当中的具体内容，用动态初始化，否则用静态初始化
 */
public class Demo03Array {
    public static void main(String[] args) {

        int[] arrayA = { 10, 20, 30};

        // 步骤拆分
        int[] arrayB;
        arrayB = new int[] {11, 12, 13};

        // 静态初始化的省略格式，不能拆分
//        int[] arrayC;
//        arrayC = {10, 20, 30};
    }
}
