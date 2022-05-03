package com.demo.HomDemo;

public class Home {
    public String address;
    public int postIndex;

    public Home(String address, int postIndex) {
        this.address = address;
        this.postIndex = postIndex;
    }

    public void printInfo() {
        System.out.println("HOME : Address - " + address + "; PostIndex - " + postIndex);
    }
}
