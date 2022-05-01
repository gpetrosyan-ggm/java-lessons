package com.demo.HomDemo;

public class ManDemo {
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.name = "525i";
        bmw.mark = "E60";
        bmw.country = "Germany";
        bmw.type = "sedan";
        bmw.vinCode = "ABC9384565M789";
        bmw.printInfo();
        System.out.println();

        Toyota toyota = new Toyota();
        toyota.engine = 3.5;
        toyota.age = 14;
        toyota.country = "Japan";
        toyota.type = "jeep";
        toyota.vinCode = "BMJ0934723VB90";
        toyota.printInfo();
        System.out.println();

        Penthouse penthouse = new Penthouse();
        penthouse.floor = "roof";
        penthouse.pool = 56.7;
        penthouse.address = "Arno Babajanyan 42/5";
        penthouse.postIndex = 0015;
        penthouse.printInfo();
        System.out.println();

        Apartment apartment = new Apartment();
        apartment.room = 5;
        apartment.square = 115.7;
        apartment.address = "Vazgen Arajin 12/60";
        apartment.postIndex = 1108;
        apartment.printInfo();
    }
}
