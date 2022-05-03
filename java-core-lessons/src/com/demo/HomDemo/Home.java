package com.demo.HomDemo;

public class Home extends Man {
    public String address;
    public int postIndex;

    public Home(int thingsCar, int thingsHome, String car, String home, String address, int postIndex) {
        super(thingsCar, thingsHome, car, home);
        this.address = address;
        this.postIndex = postIndex;
    }

    public void printInfo() {
        System.out.println("HOME : Address - " + address + "; PostIndex - " + postIndex);
    }
}
