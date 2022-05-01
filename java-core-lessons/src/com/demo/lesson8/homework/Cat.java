package com.demo.lesson8.homework;

public class Cat extends Bird {
    public String foods;

    public Cat(String type, int age, int paws, String foods) {
        super(type, age, paws);
        this.foods = foods;
    }
    public void printInfoCat() {
        printInfoBird();
        System.out.println("Food : " + foods);
    }
}
