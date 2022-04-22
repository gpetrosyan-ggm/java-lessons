package com.demo.lesson7.homework;
/*
Սարքել ցանկացած class, մի քանի փոփոխականներով և Overloading constructor-ներով
 */

public class ConstructorTv {
    String manufacturer;
    String nume;
    int channel;

    public ConstructorTv(String manufacturer, String nume) {
        this.manufacturer = manufacturer;
        this.nume = nume;
        System.out.println();
    }
    public ConstructorTv(String manufacturer, String nume, int channel) {
        this.manufacturer = manufacturer;
        this.nume = nume;
        this.channel = channel;

    }
    public ConstructorTv(String manufacturer, int channel, String nume) {
        this.manufacturer = manufacturer;
        this.nume = nume;
        this.channel = channel;
    }

    String info() {
        return manufacturer + " " + nume + " " + channel;
    }
}
