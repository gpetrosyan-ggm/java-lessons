package com.demo.lesson8.homework;

public class Chicken extends Pet {
    public String muzzle;

    public Chicken(String type, int age, String tsatsik, String muzzle) {
        super(type, age, tsatsik);
        this.muzzle = muzzle;
    }
    void printInfoChicken() {
        printInfoPet();
        System.out.println(" muzzle :" + muzzle);
    }
}
