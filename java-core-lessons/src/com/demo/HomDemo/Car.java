package com.demo.HomDemo;

public class Car extends Man {
    public String country;
    public String vinCode;
    public String type;

    public Car(int thingsCar,
               int thingsHome,
               String car,
               String home,
               String country,
               String vinCode,
               String type) {
        super(thingsCar, thingsHome, car, home);
        this.country = country;
        this.vinCode = vinCode;
        this.type = type;
    }

    public void printInfo() {
        System.out.println("CAR : Country - " + country + "; VinCode - " + vinCode + "; Type - " + type);
    }
}
