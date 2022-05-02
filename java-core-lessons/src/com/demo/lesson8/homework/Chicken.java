package com.demo.lesson8.homework;

public class Chicken extends Bird {
    public String muzzle;
    private String memory = "null";

    public Chicken(String type, int age, int paws, String muzzle) {
        super(type, age, paws);
        this.muzzle = muzzle;
    }
  public   void printInfo() {
        System.out.println("CHICKEN: muzzle - " + muzzle + " Memory - " + memory);
    }
}
