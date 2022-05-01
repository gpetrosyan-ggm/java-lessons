package com.demo.lesson8.homework;

import com.demo.lesson7.homework.Home;

public class AnimalDemo {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.printInfo("home", 12);
        dog.printInfo(4);
        dog.printInfo("Sharik");
        System.out.println();

        Cat cat = new Cat();
        cat.printInfo("Home", 8);
        cat.printInfo(4);
        cat.printInfo("ma's");
        System.out.println();

        Eagle eagle = new Eagle();
        eagle.vision = "Super";
        eagle.printInfo("wild", 25);
        eagle.printInfo("bol");
        eagle.printInfo();
        System.out.println();

        Chicken chicken = new Chicken();
        chicken.muzzle = "beak";
        chicken.printInfo("hom", 2);
        chicken.printInfo("bol");
        chicken.printInfo();
    }
}
