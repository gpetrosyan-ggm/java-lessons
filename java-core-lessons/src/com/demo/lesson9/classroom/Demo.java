package com.demo.lesson9.classroom;

import com.demo.lesson9.classroom.part1.Home;
import com.demo.lesson9.classroom.part2.Car;

public class Demo {

    public static void main(String[] args) {
        Car car = new Car();
        car.print();
        Home home1 = new Home();
        home1.print();

        com.demo.lesson9.classroom.part2.Home home2 = new com.demo.lesson9.classroom.part2.Home();
        home2.print();
    }

}
