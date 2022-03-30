package com.demo.lesson6.classroom;

public class ClassesDemo {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Mercedes";
        System.out.println(car1.brand);

        Car car2 = car1;
        car2.brand = "BMW";

        System.out.println(car1.brand);
        System.out.println(car2.brand);
    }

}