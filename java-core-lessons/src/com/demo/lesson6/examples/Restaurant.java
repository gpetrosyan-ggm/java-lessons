package com.demo.lesson6.examples;

public class Restaurant {

    String name;
    String address = "Hraparak";
    String location;
    String openTime;
    String closeTime;

    Restaurant() {

    }

    Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    String info(int count) {
        return name + " " + address + " " + location + " " + count;
    }

}
