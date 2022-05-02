package com.demo.lesson8.homework;

import com.demo.lesson7.homework.Home;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal("Predator", 34);
        animal.printInfo();

        Pet pet = new Pet("Hom", 12, "wool");
        pet.printInfo();

        Dog dog = new Dog("home", 12, "wool","Sharik" );
        dog.printInfo();

        Cat cat = new Cat("Home", 8, "Wool","ma's" );
        cat.printInfo();

        Bird bird = new Bird("Home - Wild", 23, 2);
        bird.printInfo();

        Eagle eagle = new Eagle("wild", 25, 2,"Super");
        eagle.printInfo();

        Chicken chicken = new Chicken("hom", 2, 2, "beak");
        chicken.printInfo();
    }
}
