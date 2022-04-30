package com.demo.lesson8.classroom;

public class Vehicle {

    public String type;

    public Vehicle(String type) {
        System.out.println("VEHICLE CONSTRUCTOR");
        this.type = type;
    }

    public void printType() {
        System.out.println("VEHICLE. Type: " + type);
    }

}
