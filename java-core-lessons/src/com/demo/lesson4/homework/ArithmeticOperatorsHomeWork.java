package com.demo.lesson4.homework;

public class ArithmeticOperatorsHomeWork {

    public static void main(String[] args) {
        System.out.println("=========== BASIC OPERATIONS ===========");
        basicOperatorsDemo(15, 4);
        basicOperatorsDemo(10, 15);
        System.out.println();

        System.out.println("=========== COMPOUND OPERATIONS ===========");
        compoundOperatorsDemo(7, 4);
        compoundOperatorsDemo(12, 16);
        System.out.println();

        System.out.println("=========== INCREMENT AND DECREMENT ===========");
        incrementAndDecrementDemo(10);
        incrementAndDecrementDemo(12);
        System.out.println();
    }

    /**
     * 1. Do addition(+) operation and print the result
     * 2. Do subtraction(-) operation and print the result
     * 3. Do multiplication(*) operation and print the result
     * 4. Do division(/) operation and print the result as int
     * 5. Do division(/) operation and print the result as double
     * 6. Do modulus(%) operation and print the result
     *
     * @param n the first number value
     * @param m the second number value
     */
    private static void basicOperatorsDemo(int n, int m) {

        int c1 = n + m;
        int c2 = n - m;
        int c3 = n * m;
        double c4 = n / m;
        int c5 = n / m;
        double c6 = n % m;
        double c = (c1 + c2 * c3 - c4) % c5;
        System.out.println(" c1 = "  + c1);
        System.out.println(" c2 = "  + c2);
        System.out.println(" c3 = "  + c3);
        System.out.println(" c4 = "  + c4);
        System.out.println(" c5 = "  + c5);
        System.out.println(" c6 = "  + c6);
        System.out.println(" c  = "  + c);
        System.out.println();
        // C4 -i patasxan@ xi e 3.0, che vor c4_@ nshel em double u patasxann el kotorakain petq e lini
    }

    /**
     * 1. Do addition assignment(+=) operation and print the result
     * 2. Do subtraction assignment(-=) operation and print the result
     * 3. Do multiplication assignment(*=) operation and print the result
     * 4. Do division assignment(/=) operation and print the result as int
     * 5. Do division assignment(/=) operation and print the result as double
     * 6. Do modulus assignment(%=) operation and print the result
     *
     * @param n the first number value
     * @param m the second number value
     */
    private static void compoundOperatorsDemo(int n, int m) {
        System.out.println();
       int k1 = n += m-7;
       int k2 =  m -= 9;
       int k3 = n *= (6 - m);
       int k4 = m /= 3;
       double k5 = m/= 3;
       double k6 = m %= n;
        System.out.println(" k1 = "  + k1 );
        System.out.println(" k2 = "  + k2 );
        System.out.println(" k3 = "  +k3 );
        System.out.println(" k4 = "  + k4 );
        System.out.println(" k5 = "  + k5 );
        System.out.println(" k6 = "  + k6 );

    }

    /**
     * 1. Use postfix(x++) form and print the result
     * 2. Use prefix(++x) form and print the result
     * 3. Show difference between postfix and prefix forms
     *
     * @param n the number value
     */
    private static void incrementAndDecrementDemo(int n){
        System.out.println();
        n = 7;
        int b1 = n++ - 2;
        int b2 = ++n + 1;
        int b3 = n++ / 3;
        int b4 = ++n/3;
        double b5 = n++ /3;
        System.out.println(" b1 = "  + b1);
        System.out.println(" b2 = "  + b2);
        System.out.println(" b3 = "  + b3);
        System.out.println(" b4 = "  + b4);
        System.out.println(" b5 = "  + b5);
        // xi bouble chem stanum, kotorakain tiv@ xi e misht .0

    }

}
