package com.demo.lesson6.homework;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.name = "Pendium 5";
        computer.SSD = 1000;
        computer.CPU = 1024;
        computer.ACM = 8;
        computer.Windows = 11;
        computer.max = 500;

        System.out.println(computer.name);
        System.out.println(computer.SSD);
        System.out.println(computer.CPU);
        System.out.println(computer.ACM);
        System.out.println(computer.Windows);
        System.out.println(computer.getMax(computer.SSD));
    }
}
