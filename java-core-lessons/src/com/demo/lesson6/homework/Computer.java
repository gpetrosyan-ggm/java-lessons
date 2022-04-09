package com.demo.lesson6.homework;

import java.util.Random;

public class Computer {

    int hdd; // megabayt
    String name;
    int cpu; // proc herc
    int windows;
    int ssd;

    public Computer(int ssd, int cpu, int hdd) {
        this.ssd = ssd;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    public void print() {
        System.out.println(ssd + " " + cpu + " " + hdd + " " + name+ " " + windows);
    }

    public int getMax(int ssd) {
        return this.ssd > ssd ? this.ssd : ssd;
    }

}
