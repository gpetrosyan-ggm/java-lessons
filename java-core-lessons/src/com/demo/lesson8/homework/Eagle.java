package com.demo.lesson8.homework;

public class Eagle extends Pet {
    public String vision;

    public Eagle(String type, int age, String tsatsik, String vision) {
        super(type, age, tsatsik);
        this.vision = vision;
    }

    public void printInfoEagle() {
        printInfoPet();
        System.out.println("Vision : " + vision);
    }
}
