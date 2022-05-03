package com.demo.lesson8.classroom.part2;

import java.time.LocalDateTime;

public abstract class Equipment {

    public LocalDateTime releaseDate;
    public int guaranteeMonth;
    public double price;
    public double percentage;

    public abstract void printInfo();

    public abstract double getCashback();

}
