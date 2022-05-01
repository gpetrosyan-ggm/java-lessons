package com.demo.HomDemo;

public class Home extends Man {

    public String address;
    public int postIndex;

    void printInfo() {
        super.printInfo();
        System.out.println("HOME : Address - " + address + "; PostIndex - " + postIndex);

    }
}
