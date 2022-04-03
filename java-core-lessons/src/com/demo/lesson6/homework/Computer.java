package com.demo.lesson6.homework;

public class Computer {
    int ACM;
    String name;
    int CPU;
    int Windows;
    int SSD;
    int max;

    public int getMax(int SSD) {
        return this.max > SSD ? this.max : SSD;
    }

}
