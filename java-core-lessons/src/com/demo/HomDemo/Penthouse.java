package com.demo.HomDemo;

public class Penthouse extends Home {
    public String floor;
    public double pool;

    public Penthouse(int thingsCar,
                     int thingsHome,
                     String car,
                     String home,
                     String address,
                     int postIndex,
                     String floor, double pool) {
        super(thingsCar, thingsHome, car, home, address, postIndex);
        this.floor = floor;
        this.pool = pool;
    }

    public void printInfo() {
        System.out.println("PENTHOUSE : Floor - " + floor + "; Pool - " + pool);
    }
}
