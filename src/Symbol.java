public class Symbol {
    public static void main(String args[]) {
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;

        c = a & b; /* 0000 1100 = 12*/
        System.out.println("a & b = "+c);

        c = a | b; /* 0011 1101 = 61*/
        System.out.println("a | b = "+c);

        c = a ^ b; /* 0011 0001 = 49*/
        System.out.println("a ^ b = "+c);

        c = ~a; /* 1100 0011 = */
        System.out.println("~a = "+c);

        c = a << 2; /*1111 0000 = 240*/
        System.out.println("a << 2 = "+c);

        c = a >> 2; /*0000 1111 = 15*/
        System.out.println("a >> 2 = "+c);

        c = b >> 2; /*0000 0011 = 3*/
        System.out.println("b >> 2 = "+c);

        c = a >>> 2;
        System.out.println("a >>> 3 = "+c);
    }
}
