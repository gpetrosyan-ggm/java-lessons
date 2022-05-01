package com.demo.lesson8.homework;

public class Dog extends Bird {
    public String name;

    //    public Dog(String type, int age, int paws, String name) {
//        super(type, age, paws);
//        this.name = name;
//    }
    public void printInfo(String name) {
        System.out.println("DOG : Name - " + name);
    }
}
