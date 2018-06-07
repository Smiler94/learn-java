import java.util.Arrays;

public class Array {
    public static void main(String args[]) {
        int size = 10;
        double[] myList = new double[size];

        Array array = new Array();
        array.arrayValue(myList);
        array.arrayForeach(myList);
        array.arrayMulti();
        array.arraySort();
    }

    private void arrayValue(double[] list) {
        list[0] = 5.6;
        list[1] = 4.5;
        list[2] = 3.3;
        list[3] = 13.2;
        list[4] = 4.0;
        list[5] = 34.33;
        list[6] = 34.0;
        list[7] = 45.45;
        list[8] = 99.993;
        list[9] = 11123;

        double total = 0;
        for (int i = 0;i < list.length; i ++) {
            total += list[i];
        }
        System.out.println("total value is :" + total);
    }

    private void arrayForeach(double[] list) {
        for (double v : list) {
            System.out.println("value of list is :" + v);
        }
    }

    private void arrayMulti() {
        int a[][] = new int[2][3];

        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;

        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;

        System.out.print(a[0]);
//        System.out.print(a[1]);
    }

    private void arraySort() {
        int a[] = {8,5,3,1,4};

        Arrays.sort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
