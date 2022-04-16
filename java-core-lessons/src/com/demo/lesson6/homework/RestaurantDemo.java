package com.demo.lesson6.homework;

public class RestaurantDemo {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant("Arni", 7000);
        Restaurant rest1 = new Restaurant("arni", "Abovyan", 110);
        rest = rest1;
        System.out.println(rest.fee(5000));
        System.out.println(rest1.fee(4000));
    }
}
