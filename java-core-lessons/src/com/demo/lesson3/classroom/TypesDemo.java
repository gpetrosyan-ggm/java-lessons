package com.demo.lesson3.classroom;

public class TypesDemo {

    // single line comment
    /* multi line comment*/

    /**
     * Documentation comment
     */

    /*
     * byte
     * short
     * int
     * long
     *
     * char
     *
     * float
     * double
     *
     * boolean true false  1 0
     * */

    private static int num = 5;
    private static int m;
    private static char c;

    public static void main(String[] args) {

//        System.out.println(m);

//        numberDemo(5);

//        numSqr(5, 2);

//        visibilityDemo();

//        charDemo();

        castDemo();
    }

    private static void castDemo() {
        byte b = 10;
        short s = 1000;
        int i = 150150;
        long l = 150150150;

        double d = 125.5;

        short bb = b;
        byte ss = (byte) s;

        float f = i;

        int dd = (int) d;

        System.out.println(bb);
        System.out.println(ss);
        System.out.println(f);
        System.out.println(dd);

        // Device by MOD
        System.out.println(1000 % 900);
    }

    private static void numSqr(int a, int b) {
        int result = a * a + 2 * a * b + b * b;
        System.out.println(result);
    }

    private static void visibilityDemo() {
        System.out.println(num);

        num = 51;
        System.out.println(num);

        if (true) {
            int i = 1;
            System.out.println(i);
        }
//        System.out.println(i); // i not visible here, will throw an compile exception
    }

    private static void numberDemo(int num) {
        int a = 11;
        int b = 2;

        System.out.println(num * (a + b));
    }

    private static void charDemo() {
        char a = 'M';
        char b = 'X';
        char x = 11;
        char c = (char) (b - a);

        System.out.println(a + ": " + Character.getNumericValue(a));
        System.out.println(b + ": " + Character.getNumericValue(b));
        System.out.println(x + ": " + Character.getNumericValue(x));
        System.out.println(c + ": " + Character.getNumericValue(c));
    }

}
