// 可变参数
public class Varargs {
    public static void main(String args[]) {
        Varargs var = new Varargs();


        var.vararg(24,3,3,4,56.5);

        var.vararg(new double[]{1,2,3});
    }

    //一个方法中只能指定一个可变参数，它必须是方法的最后一个参数。任何普通的参数必须在它之前声明
    private void vararg(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
        }

        double result = numbers[0];

        for(double i : numbers) {
            if (i > result) {
                result = i;
            }
        }
        System.out.println("The max value is :" + result);
    }
}
