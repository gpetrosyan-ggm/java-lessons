package com.demo.lesson7.homework;

public class Varard {
    public static void main(String[] args) {
        var(1, 2, 3);
        var(12., 23, 45, 67);
        var(34, 34., 2, 1);
        var(12, 34, "aaa", " bbb", " 12");
        var("123");
    }
    public static void var(String l) {
        System.out.print(l);
    }
    public static void var(String l, String... v) {
        System.out.println();
        System.out.print(l);
        for (String x : v) {
            System.out.println(x + " ");
        }
    }
    public static void var(int a, int... v) {
        System.out.println();
        System.out.print(a + " ");
        for (int x : v) {
            System.out.print(x + " ");
        }
    }

    public static void var(int b, double c, int... v) {
        System.out.println();
        System.out.print(b + " " + c + " ");
        for (int x : v) {
            System.out.print(x + " ");
        }
    }
    public static void var(double d, double e, int... v) {
        System.out.println();
        System.out.print(d + " " + e + " ");
        for (int x : v) {
            System.out.print(x + " ");
        }
    }
    public static void var(double f, double k, String... v) {
        System.out.println();
        System.out.print(f + " " + k + " ");
        for (String x : v) {
            System.out.print(x + " ");
        }
    }
}
