package com.demo.lesson7.homework;

public class AccessControlDemo {
    public static void main(String[] args) {
        AccessControl access = new AccessControl();
        access.name = "Arnold";
        access.surname = "Martirosyan";
        access.patronymic = "Valerii";
     //   access.NATIONALITI = "Karabax";

        access.CV();
        access.CV1();
        access.CV2();


        System.out.println(access);
    }

}

