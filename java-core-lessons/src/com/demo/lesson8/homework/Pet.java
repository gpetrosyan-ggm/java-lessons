package com.demo.lesson8.homework;

public class Pet extends Animal {
    public String coverage;
    private String floor = "male";

    public Pet(String type, int age, String coverage) {
        super(type, age);
        this.coverage = coverage;
    }
    public void printInfo() {
        System.out.println("PET: Coverage - " + coverage + " Floor - " + floor);
    }
}
