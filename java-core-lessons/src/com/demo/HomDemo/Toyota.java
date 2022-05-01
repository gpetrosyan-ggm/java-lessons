package com.demo.HomDemo;

public class Toyota extends Car {
    public int age;
    public double engine;

    void printInfo() {
        super.printInfo();
        System.out.println("TOYOTA : Age - " + age + "; Engine - " + engine);
    }
}
