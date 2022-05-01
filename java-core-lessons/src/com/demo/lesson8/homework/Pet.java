package com.demo.lesson8.homework;

public class Pet extends Animal {
    public String coverage;

//    public Pet(String type, int age, String tsatsik) {
//        super(type, age);
//        this.tsatsik = tsatsik;
//    }
    public void printInfo(String coverage) {
        System.out.println("PET: Coverage - " + coverage);
    }
}
