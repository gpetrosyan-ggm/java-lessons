package com.demo.lesson8.homework;

public class Pet extends Animal {
    public String tsatsik;

    public Pet(String type, int age, String tsatsik) {
        super(type, age);
        this.tsatsik = tsatsik;
    }
    public void printInfoPet() {
        printInfo();
        System.out.println(" Tsetsik :" + tsatsik);
    }
}
