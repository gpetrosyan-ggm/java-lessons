package com.demo.lesson8.homework;

public class Cat extends Pet {
    public String foods;

        public Cat(String type, int age, String coverage, String foods) {
        super(type, age, coverage);
        this.foods = foods;
    }
    public void printInfo() {
        System.out.println("CAT : Food - " + foods);
    }
}
