package com.demo.HomDemo;

public class Bmw extends Car {
    public String name;
    public String mark;

    public Bmw(String country, String vinCode, String type, String name, String mark) {
        super(country, vinCode, type);
        this.name = name;
        this.mark = mark;
    }

    public void printInfo() {
        System.out.println("BMW : Name - " + name + "; Marka - " + mark);
    }
}
