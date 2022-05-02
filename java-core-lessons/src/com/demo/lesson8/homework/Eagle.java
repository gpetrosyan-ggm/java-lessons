package com.demo.lesson8.homework;

public class Eagle extends Bird {
    public String vision;
    private int flightАltitude = 1000;

    public Eagle(String type, int age, int paws, String vision) {
        super(type, age, paws);
        this.vision = vision;
    }

    public void printInfo() {
        System.out.println("EAGLE : Vision - " + vision + " FlightАltitude - " +flightАltitude );
    }
}
