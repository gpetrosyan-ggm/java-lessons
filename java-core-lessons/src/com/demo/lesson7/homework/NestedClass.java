package com.demo.lesson7.homework;

public class NestedClass {
    String name = "aaa";

    void str() {
        Internal internal = new Internal();
        internal.v();
    }
    public class Internal {
        void v() {
            NestedClass nestedClass = new NestedClass();
            nestedClass.name = "Arni";
            System.out.println(nestedClass.name);
        }
    }
}
