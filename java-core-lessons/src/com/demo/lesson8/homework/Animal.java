package com.demo.lesson8.homework;

public class Animal {
    public String type;
    public int age;
    private String nume = "Enimal";

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(nume + " Type : " + type + ", age " + age);
    }
}
