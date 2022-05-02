package com.demo.HomDemo;

public class Toyota extends Car {
    public int age;
    public double engine;

    public Toyota(String country, String vinCode, String type, int age, double engine) {
        super(country, vinCode, type);
        this.age = age;
        this.engine = engine;
    }

    void printInfo() {
        System.out.println("TOYOTA : Age - " + age + "; Engine - " + engine);
    }
}
