package com.demo.lesson7.classroom;

public class Animal {

    public String type;
    public int age;

    public static class Dog {
        public static String t;

        void aaa() {
            Animal a = new Animal();
            System.out.println(a.type);
        }
    }

    void bbb() {
        System.out.println(Dog.t);
    }

}
