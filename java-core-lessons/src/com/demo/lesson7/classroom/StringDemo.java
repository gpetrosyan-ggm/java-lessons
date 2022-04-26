package com.demo.lesson7.classroom;

public class StringDemo {

    public static void main(String[] args) {
//        String s2 = new String("aaa");

        String s1 = "aaa";
        s1 = "bbb" + "asd" + 123;
        s1 = 123 + "2";

        System.out.println(s1.length());
        String name = "Arni";
        System.out.println("Name: " + name);
        compare();
    }

    // primity type  -> ==
    // object type  -> equals
    private static void compare() {
        String a = "aaa";
        String b = "aaa";
        String c = new String("aaa");

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
