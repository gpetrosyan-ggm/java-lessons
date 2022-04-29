package com.demo.lesson7.homework;

public class StringDemo2 {
    public static void main(String[] args) {
        String a = "aa a " + 111;
        String d = "bob " + 3.67;
        String b = 12 + "" + 67.01 + " bbb";
        String s = "abc" + " acd" + " bca";
        String sum = a + d + b + s;

        System.out.println(a + " = " + a.length());
        System.out.println(d + " = " + d.length());
        System.out.println(b + " = " + b.length());
        System.out.println(s + " = " + s.length());
        System.out.println(sum + " = " + sum.length());

    }
}
