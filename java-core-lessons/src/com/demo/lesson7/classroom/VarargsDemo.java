package com.demo.lesson7.classroom;

public class VarargsDemo {

    public static void main(String[] args) {
        v1("a", "b");
    }

    public static void v1(String a, String... str) {
        System.out.println("vararg");
    }

    public static void v1(String str, String s) {
        System.out.println("simple");
    }

}
