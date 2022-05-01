package com.demo.lesson8.homework;

public class Bird extends Animal {
    public int paws;

    //    public Bird(String type, int age, int paws) {
//        super(type, age);
//        this.paws = paws;
//    }
    public void printInfo(int paws) {
        System.out.println("BIRD: Pawe - " + paws);
    }
}
