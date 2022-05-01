package com.demo.HomDemo;

public class Car {
    public String country;
    public String vinCode;
    public String type;

    void printInfo(String country, String vinCode, String type) {
        System.out.println("CAR : Country - " + country + "; VinCode - " + vinCode + "; Type - " + type);
    }
}
