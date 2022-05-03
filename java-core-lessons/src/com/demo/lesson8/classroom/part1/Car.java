package com.demo.lesson8.classroom.part1;

import java.time.LocalDateTime;

public class Car extends Vehicle {

    public String country = "China";
    public LocalDateTime releaseDate;
    public String vinCode;
    private static String type;

    static {
        System.out.println("STATIC BLOCK");
        type = "CAR";
    }

    public Car(LocalDateTime releaseDate, String vinCode) {
        super(type);
        System.out.println("CAR CONSTRUCTOR");
        this.releaseDate = releaseDate;
        this.vinCode = vinCode;
    }

    public Car(String vinCode) {
        super(type);
        this.vinCode = vinCode;
    }

    public void printVinCode() {
        System.out.println("CAR: Released at: " + releaseDate + ", Vin code: " + vinCode);
    }

    public void printCountry() {
        System.out.println("CAR: Country: " + country);
    }

}
