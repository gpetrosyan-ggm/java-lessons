package com.demo.lesson6.homework;

public class UserDemo {
    public static void main(String[] args) {

        User user = new User();

        user.nume = "Arnold";

        user.yearOfBirth = 1987;

        user.month = "mart";

        user.day = 10;

        System.out.println("PARON " + user.nume + "@ cnvel e " + user.yearOfBirth + user.month + user.day);
    }
}
