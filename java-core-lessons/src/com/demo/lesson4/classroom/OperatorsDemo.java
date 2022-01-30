package com.demo.lesson4.classroom;

public class OperatorsDemo {

    public static void main(String[] args) {
//        ternaryOperatorDemo(true);
//        ternaryOperatorDemo(false);
//        assignmentOperatorDemo();
//        logicalOperatorsDemo();
//        relationOperatorsDemo();
//        incrementAndDecrementDemo();
//        arithmeticOperatorsDemo();
//        arithmeticOperatorsSimpleDemo();
    }

    private static void ternaryOperatorDemo(boolean b) {
        // type val = exp1 ? exp2 : exp3;
        // ete chisht (exp1) urem exp2, hakarak depqum exp3.
        int n = 1;
        int m = 2;
        int val = b ? n : m;
        System.out.println(val);
    }

    private static void assignmentOperatorDemo() {
        int a = 10;
        int x = 1, y = 1, z = 1;

        // x = x + 1;
        // x = y = z = 100;
        x *= y -= z += 100;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    private static void logicalOperatorsDemo() {
        /*
         * &
         * |
         * ^
         * ||
         * &&
         * !
         * &=
         * |=
         * ^=
         * ==
         * !=
         * */

        boolean a = true; // 10 > 5
        boolean b = false; // 2 == 3

        a &= b; // a = a & b;
        boolean c = a & b;

        // &
        System.out.println("LOGICAL AND: " + (a & b));

        // |
        System.out.println("LOGICAL OR: " + (a | b));

        // ^
        System.out.println("LOGICAL XOR: " + (a ^ b));

        // ||
        System.out.println("SHORT-CIRCUIT OR: " + (a || b));

        // &&
        System.out.println("SHORT-CIRCUIT AND: " + (a && b));

        // !
        System.out.println("LOGICAL UNARY NOT: " + (!a));


        int i = 0;
        if (i != 0 && 10 / i == 10) {
            System.out.println("OK");
        }

        int j = 0;
        if (j != 0 & ++j == 10) {
            System.out.println("OK");
        }
        System.out.println(j);
    }

    private static void relationOperatorsDemo() {
        /*
         * ==
         * !=
         * >
         * <
         * >=
         * <=
         * */

        int a = 10;
        int b = 15;

        boolean t = 15 > 2;
        System.out.println(t);

        // ==
        System.out.println("EQUAL TO: " + (a == b));
        System.out.println("EQUAL TO: " + (true == true));

        // !=
        System.out.println("NOT EQUAL TO: " + (a != b));
        System.out.println("NOT EQUAL TO: " + (false != false));

        // >
        System.out.println("GREATER THAN: " + (a > b));

        // <
        System.out.println("LESS THEN: " + (a < b));

        // >=
        System.out.println("GREATER THAN OR EQUAL TO: " + (b >= a));

        // <=
        System.out.println("LESS THEN OR EQUAL TO: " + (b <= a));
    }

    private static void incrementAndDecrementDemo() {
        /*
         * ++
         * --
         * */

        // int x = 10;
        // x = x + 1; x += 1; ++x, x++
        // x = x - 1; x -= 1; --x, x--

        int a = 10;
        int b = 5;

        // a = a + 1;
        // c = 10 + a;
        int c = 10 + ++a;

        // d = 10 + b;
        // b = b + 1;
        int d = 10 + b++ + b;
        System.out.println(c);
        System.out.println(d);

        System.out.println(a);
        System.out.println(b);
    }

    private static void arithmeticOperatorsDemo() {
        /*
         * +=
         * -=
         * *=
         * /=
         * %=
         **/


        // Addition Assignment
        int a = 10;
        a += 5; // a = a + 5;
        System.out.println(a);

        // Addition subtraction
        int b = 15;
        b -= 3; // b = b - 3;
        System.out.println(b);

        // Addition multiplication
        int c = 5;
        c *= 12; // c = c * 12;
        System.out.println(c);

        // Addition division
        int d = 20;
        d /= 2; // d = d / 2;
        System.out.println(d);

        // Addition modulus
        int e = 21;
        e %= 2; // e = e % 2;
        System.out.println(e);
    }

    private static void arithmeticOperatorsSimpleDemo() {
        /*
         * +
         * -
         * *
         * /
         * %
         * ++
         * --
         * */

        // unary minus
        int n = 10;
        int k = -n;
        System.out.println(k);

        // unary plus
        int m = -10;
        int q = +m;
        System.out.println(q);


        int a = 10;
        int b = 15;
        int c = 20;

        // +
        System.out.println("PLUS: " + (a + 10));

        // -
        System.out.println("MINUS: " + (b - c));

        // *
        System.out.println("BAZMAPATKUM: " + (a * 3));

        // /
        System.out.println("BAJANUM: " + (b / 6.0));

        // %
        System.out.println("MODUL: " + (c % 3));

        // ++  +1
        System.out.println("INCREMENT: " + (++a));

        // --  -1
        System.out.println("DECREMENT: " + (--a));
    }

}
