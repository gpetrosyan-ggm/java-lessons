package com.demo.lesson13.classroom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public strictfp class OtherTopics {

    transient String password = "aaa";

    volatile String name;

    public native int nativeTest();

    public static void main(String[] args) {
        staticTest();
        assertTest(10);
        assertTest(-10);

        test(12);
        test(12.0);
        test(new ArrayList<>());
        test(new LinkedList<>());
        test("aaa");
    }

    public static void staticTest() {
        System.out.println(MAX_VALUE);
        System.out.println(abs(-1));
        System.out.println(pow(2, 31));
    }

    public static void assertTest(int a) {
        assert (a >= 0) : "negative value";
        System.out.println(a);
    }

    public static void test(Object obj) {
        if (obj instanceof Integer) {
            System.out.println("Int type");
        } else if (obj instanceof Double) {
            System.out.println("Double type");
        } else if (obj instanceof ArrayList) {
            System.out.println("ArrayList type");
        } else if (obj instanceof List) {
            System.out.println("List type");
        } else {
            System.out.println("String type");
        }
    }

}
