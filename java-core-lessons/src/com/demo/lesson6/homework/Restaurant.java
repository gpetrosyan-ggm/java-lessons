package com.demo.lesson6.homework;

public class Restaurant {
    String name;
    String address;
    int restFee;

    public double fee(double fee) {
        System.out.println(name);
        return fee + restFee;
    }

    Restaurant(String name, int restFee) {
        this.name = name;
        this.restFee = restFee;

    }
    Restaurant(String name, String address, int restFee){
        this.address = address;
        this.name = name;
        this.restFee = restFee;
    }
}
