package Utils;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions {
    public static void main(String args[]) {
        Exceptions ex = new Exceptions();
        ex.throwException();
        ex.multiException();
    }

    private void throwException() {
        try {
            int a[] = new int[2];
            System.out.println("Access element three : " + a[3]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" +e);
        }
        System.out.println("Out of the block");
    }

    private void multiException() { // 多重异常
        try {
            String fileName = "~/test.php";
            FileInputStream file = new FileInputStream(fileName);
            byte x = (byte) file.read();
            // 程序代码
            int a[] = new int[2];
            System.out.println("Access element three : " + a[3]);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Catch IOException");
        } catch (ArrayIndexOutOfBoundsException i) {
            i.printStackTrace();
        }
    }
}
