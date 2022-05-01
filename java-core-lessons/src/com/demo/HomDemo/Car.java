package com.demo.HomDemo;

public class Car extends Man {
    public String country;
    public String vinCode;
    public String type;

    void printInfo() {
        super.printInfo();
        System.out.println("CAR : Country - " + country + "; VinCode - " + vinCode + "; Type - " + type);
    }
}
