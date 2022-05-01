package com.demo.lesson8.homework;

public class Animal {
    public String type;
    public int age;
    private String name = "Enimal";

//    public Animal(String type, int age) {
//        this.type = type;
//        this.age = age;
//    }
    public void printInfo(String type, int age) {
        System.out.println("ANIMAL: Type - " + type + ", age - " + age);
    }
}
