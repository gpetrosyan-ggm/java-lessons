package com.demo.lesson6.homework;

import java.util.Random;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer(100, 1024, 8);
        computer.name = "Pendium 5";
        computer.windows = 11;
        computer.print();

        System.out.println(computer.getMax(150));
    }
}
