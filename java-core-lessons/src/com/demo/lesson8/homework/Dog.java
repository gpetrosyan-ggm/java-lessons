package com.demo.lesson8.homework;

public class Dog extends Pet {
    public String name;
    private String family = " yes";

        public Dog(String type, int age, String coverage, String name) {
        super(type, age, coverage);
        this.name = name;
    }
    public void printInfo() {
        System.out.println("DOG : Name - " + name + " Family - " +family);
    }
}
