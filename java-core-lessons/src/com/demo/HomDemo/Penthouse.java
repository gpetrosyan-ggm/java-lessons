package com.demo.HomDemo;

public class Penthouse extends Home {
    public String floor;
    public double pool;


    public Penthouse(String address, int postIndex, String floor, double pool) {
        super(address, postIndex);
        this.floor = floor;
        this.pool = pool;
    }

    void printInfo() {
        System.out.println("PENTHOUSE : Floor - " + floor + "; Pool - " + pool);
    }
}
