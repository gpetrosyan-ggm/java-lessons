package com.demo.HomDemo;

public class Man {
    public int thingsCar;
    public int thingsHome;
    public String car;
    public String home;

    public Man(int thingsCar, int thingsHome, String car, String home) {
        this.thingsCar = thingsCar;
        this.thingsHome = thingsHome;
        this.car = car;
        this.home = home;
    }

    public void printInfo() {
        System.out.println(
                "MAN: ThingsCar - " + thingsCar + "; ThingsHome - " + thingsHome + "; Car - " + car + "; Home - " +
                home);
    }

}
