package com.demo.HomDemo;

public class Penthouse extends Home {
    public String floor;
    public double pool;

    void printInfo() {
        super.printInfo();
        System.out.println("PENTHOUSE : Floor - " + floor + "; Pool - " + pool);
    }
}
