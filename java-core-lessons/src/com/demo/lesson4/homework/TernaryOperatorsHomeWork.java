package com.demo.lesson4.homework;

public class TernaryOperatorsHomeWork {

    public static void main(String[] args) {
        simpleDemo(true);
        simpleDemo(false);

        // TODO uncomment and fill input value using expression like 5 > 9
        // simpleDemo();
    }

    /**
     * exp ? exp1 : exp2
     * Print 'Yes', if b is true, other wise print 'No'.
     *
     * @param b the boolean value
     */
    private static void simpleDemo(boolean b) {
        int n = 1;
        int m = 2;
        int val = b ? n : m;
        System.out.println(val);



    }

}
