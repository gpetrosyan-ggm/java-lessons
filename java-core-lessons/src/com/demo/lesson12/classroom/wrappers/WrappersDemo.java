package com.demo.lesson12.classroom.wrappers;

public class WrappersDemo {

    // byte Byte
    // short Short
    // int Integer
    // long Long
    // double Double
    // float Float
    // char Character
    // boolean Boolean

    public static void main(String[] args) {
        demoChar1();
        demoBoolean1();
        demoNumber1();
        System.out.println(test(Integer.valueOf(12)));
        test(true);
        test(false);
    }

    private static void test(Boolean b) {
        if (b) {
            System.out.println("YES");
        }
    }

    private static Integer test(int i) {
        return i;
    }

    private static void demoChar1() {
        Character ch = 'a';
        char c = ch;
        System.out.println(ch);
    }

    private static void demoBoolean1() {
        Boolean b = true;
        System.out.println(b);
    }

    private static void demoNumber1() {
        Integer i = 130;
        int ii = i;
        System.out.println(ii);
    }


    private static void demoChar() {
        Character ch = Character.valueOf('a');
        System.out.println(ch);
    }

    private static void demoBoolean() {
        Boolean b = Boolean.valueOf("true");
        System.out.println(b);
    }

    private static void demoNumber() {
        Integer i = Integer.valueOf("130");
        int ii = i.intValue();
        System.out.println(ii);
    }

}
