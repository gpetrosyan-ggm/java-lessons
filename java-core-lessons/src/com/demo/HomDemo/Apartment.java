package com.demo.HomDemo;

public class Apartment extends Home {
    public double square;
    public int room;

    public Apartment(int thingsCar,
                     int thingsHome,
                     String car,
                     String home,
                     String address,
                     int postIndex,
                     double square,
                     int room) {
        super(thingsCar, thingsHome, car, home, address, postIndex);
        this.square = square;
        this.room = room;
    }
    public void printInfo() {
        System.out.println("APARTMENT : Square - " + square + "; Room - " + room);
    }
}
