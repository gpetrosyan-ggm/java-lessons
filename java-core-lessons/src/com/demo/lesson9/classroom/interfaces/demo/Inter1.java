package com.demo.lesson9.classroom.interfaces.demo;

public interface Inter1 extends Inter2 {

    default void test() {
        System.out.println("Inter 1 test ");
    }

}
