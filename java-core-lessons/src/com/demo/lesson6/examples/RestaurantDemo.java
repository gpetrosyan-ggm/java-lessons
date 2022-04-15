package com.demo.lesson6.examples;

public class RestaurantDemo {

    public static void main(String[] args) {
        Restaurant rest1 = new Restaurant();
        Restaurant rest2 = new Restaurant("Kovkas", "Abovyan");

        System.out.println(rest1.info(5));
        System.out.println(rest2.info(5));
    }

}
