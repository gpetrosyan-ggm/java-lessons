package com.demo.lesson7.classroom;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(fact(1));
        System.out.println(fact(5));
        System.out.println(fact(6));
        System.out.println(fact(7));

//        System.out.println(fact5());

        // fact(5) = 5 * fact(4) = 5 * 4 * fact(3) = 5 * 4 * 3 * fact(2) = 5 * 4 * 3 * 2 * fact(1) = 5 * 4 * 3 * 2 * 1
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

//    // 1 x 2 x 3 x 4 x 5
//    static int fact5() {
//        return 5 * fact4();
//    }
//
//    static int fact4() {
//        return 4 * fact3();
//    }
//
//    static int fact3() {
//        return 3 * fact2();
//    }
//
//    static int fact2() {
//        return 2 * fact1();
//    }
//
//    static int fact1() {
//        return 1;
//    }

}
