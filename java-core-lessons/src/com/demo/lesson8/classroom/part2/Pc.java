package com.demo.lesson8.classroom.part2;

import java.time.LocalDateTime;

public final class Pc extends Computer {

    @Override
    public void setData(double price, double percentage) {
        this.price = price;
        this.percentage = percentage;
        this.releaseDate = LocalDateTime.now();
        this.guaranteeMonth = 12;
    }

    @Override
    public void printInfo() {
        System.out.printf("Price: %s, Release Date: %s, Guarantee Month: %s.\n", price, releaseDate, guaranteeMonth);
    }

    @Override
    public double getCashback() {
        return (price - 5) * percentage / 100;
    }

    public void test() {
        System.out.println("test");
    }

    @Override
    public String toString() {
        return "Pc{" +
               "releaseDate=" + releaseDate +
               ", guaranteeMonth=" + guaranteeMonth +
               ", price=" + price +
               ", percentage=" + percentage +
               '}';
    }

}
