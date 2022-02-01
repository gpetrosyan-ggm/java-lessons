package com.demo.lesson3.classroom;

public class StringDemo {

    public static void main(String[] args) {
        String str = "a=";
        int a = 6;
        str += a;
        String s = "a" + 5 + 2.5 + true + 'c';
        System.out.println("a=" + str);
        System.out.println(s);
    }

}
