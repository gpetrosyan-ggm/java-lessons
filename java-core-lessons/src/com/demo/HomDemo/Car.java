package com.demo.HomDemo;

public class Car {
    public String country;
    public String vinCode;
    public String type;

    public Car(String country, String vinCode, String type) {
        this.country = country;
        this.vinCode = vinCode;
        this.type = type;
    }

    void printInfo() {
        System.out.println("CAR : Country - " + country + "; VinCode - " + vinCode + "; Type - " + type);
    }
}
