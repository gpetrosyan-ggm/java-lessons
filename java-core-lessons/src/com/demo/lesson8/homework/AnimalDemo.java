package com.demo.lesson8.homework;

import com.demo.lesson7.homework.Home;

public class AnimalDemo {
    public static void main(String[] args) {

        Dog dog = new Dog("Home", 12, 4, "Sharik");
        Cat cat = new Cat("Home", 8, 4, "maus");
        Eagle eagle = new Eagle("wild", 25, "stylus", "super");
        Chicken chicken = new Chicken("Home", 2, " stylus", "beak");
        dog.printInfoDog();
        System.out.println();

        cat.printInfoCat();
        System.out.println();

        eagle.printInfoEagle();
        System.out.println();

        chicken.printInfoChicken();
    }
}
