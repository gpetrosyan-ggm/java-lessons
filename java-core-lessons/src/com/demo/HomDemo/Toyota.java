package com.demo.HomDemo;

public class Toyota extends Car {
    public int age;
    public double engine;

    public Toyota(int thingsCar,
                  int thingsHome,
                  String car,
                  String home,
                  String country,
                  String vinCode,
                  String type, int age, double engine) {
        super(thingsCar, thingsHome, car, home, country, vinCode, type);
        this.age = age;
        this.engine = engine;
    }

    public void printInfo() {
        System.out.println("TOYOTA : Age - " + age + "; Engine - " + engine);
    }
}
