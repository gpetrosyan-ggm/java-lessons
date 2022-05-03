package com.demo.lesson8.classroom.part1;

import java.time.LocalDateTime;

public class CarHonda extends Car {

    int doors;
    String name;

    public CarHonda(LocalDateTime releaseDate, String vinCode, int doors, String name) {
        super(releaseDate, vinCode);
        this.doors = doors;
        this.name = name;
    }

    public void printInfo() {
        printVinCode();
        System.out.println("HONDA: Name: " + name + ", Doors: " + doors);
    }

}
