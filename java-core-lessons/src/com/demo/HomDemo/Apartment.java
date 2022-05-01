package com.demo.HomDemo;

public class Apartment extends Home {
    public double square;
    public int room;

    void printInfo() {
        super.printInfo();
        System.out.println("APARTMENT : Square - " + square + "; Room - " + room);
    }
}
