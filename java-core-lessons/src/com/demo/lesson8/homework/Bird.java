package com.demo.lesson8.homework;

public class Bird extends Animal {
    public int paws;
    private String covorage = "feather";

        public Bird(String type, int age, int paws) {
        super(type, age);
        this.paws = paws;
    }
    public void printInfo() {

        System.out.println("BIRD: Pawe - " + paws + " Covorage - " + covorage);
    }
}
