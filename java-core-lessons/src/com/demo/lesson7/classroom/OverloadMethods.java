package com.demo.lesson7.classroom;

public class OverloadMethods {

    public static void main(String[] args) {
        Car c = new Car("Black", 100);
        String a = c.info();
        System.out.println(a);
        int sumA = sum(1, 2);
        System.out.println(sum(1, 2));
        System.out.println();

        System.out.println(sum(1L, 2));
        System.out.println();

        System.out.println(sum(1.1, 2));
        System.out.println();

        System.out.println(sum(1.1, 2L));
        System.out.println();

        System.out.println(sum(1.1, 2L, 2.2));
        System.out.println();

        System.out.println(sum(1.1, 1.1));
        System.out.println();
    }

    public static int sum(int a, int b) {
        System.out.println("INT");
        return a + b;
    }

    public static double sum(double a, double b, double c) {
        System.out.println("DOUBLE");
        return a + b + c;
    }

    public static double sum(double a, double b) {
        System.out.println("DOUBLE");
        return a + b;
    }

    public static long sum(long a, long b) {
        System.out.println("LONG");
        return a + b;
    }

}
