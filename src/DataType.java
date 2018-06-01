public class DataType {
    public static void main(String[] args) {
        DataType dataType = new DataType();
        dataType.byteType();
        dataType.shortType();
        dataType.intType();
        dataType.longType();
        dataType.floatType();
        dataType.doubleType();
        dataType.booleanType();
        dataType.charType();
    }

    private void byteType() {
        byte a = 100;
        System.out.println("byte 类型，8位，有符号, " + a);
    }

    private void shortType() {
        short a = 10000;
        System.out.println("short 类型，16位，有符号，" + a);
    }

    private void intType() {
        long a = 1000000;
        System.out.println("int 类型，32位，有符号，" + a);
    }

    private void longType() {
        long a = 1000000000;
        System.out.println("long 类型，64位，有符号，" + a);
    }

    private void floatType() {
        float a = 234.5f;
        System.out.println("float 类型，32位，有符号，1-8-23，" + a);
    }

    private void doubleType() {
        double a = 12345.5;
        System.out.println("double 类型，64位，有符号，1-11-52，" + a);
    }

    private void booleanType() {
        boolean a = true;
        System.out.println("boolean 类型，1位，无符号，" + a);
    }

    private void charType() {
        char a = 'A';
        System.out.println("char 类型，16位 Unicode 字符，" + a);
    }
}
