package com.demo.HomDemo;

public class Bmw extends Car {
    public String name;
    public String mark;

    void printInfo() {
        super.printInfo();
        System.out.println("BMW : Name - " + name + "; Marka - " + mark);
    }
}
