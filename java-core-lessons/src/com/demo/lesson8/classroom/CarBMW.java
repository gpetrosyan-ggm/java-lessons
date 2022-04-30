package com.demo.lesson8.classroom;

import java.time.LocalDateTime;

public class CarBMW extends Car {

    String country = "Germana";
    int speed;
    String mark;

    public CarBMW(LocalDateTime releaseDate, String vinCode, int speed, String mark) {
        super(releaseDate, vinCode);
        System.out.println("BMW CONSTRUCTOR");
        this.speed = speed;
        this.mark = mark;
    }

    public CarBMW(LocalDateTime releaseDate, String vinCode) {
        super(vinCode);
    }

    public void printInfo() {
        printVinCode();
        System.out.println("BMW: Mark: " + mark + ", Speed: " + speed);
    }

    public void printCountry() {
        System.out.println("BMW");
        super.printCountry();
    }

}
