package com.demo.lesson8.classroom.part2;

import java.time.LocalDateTime;

public class Notebook extends Computer {

    @Override
    public void setData(double price, double percentage) {
        this.price = price;
        this.percentage = percentage;
        this.releaseDate = LocalDateTime.now();
        this.guaranteeMonth = 24;
    }

    @Override
    public void printInfo() {
        System.out.printf("Price: %s, Release Date: %s, Guarantee Month: %s.\n", price, releaseDate, guaranteeMonth);
    }

    @Override
    public double getCashback() {
        return price * percentage / 100;
    }

}
