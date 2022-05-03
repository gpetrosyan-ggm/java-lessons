package com.demo.HomDemo;

public class ManDemo {
    public static void main(String[] args) {
        Man man = new Man(2, 2, "BMW - TOYOTA", "HOME");
        man.printInfo();
        System.out.println();

        Car car = new Car(2, 2, "BMW - TOYOTA", "HOME", "EUROPE", "XYZ567289S003", "sedan");
        car.printInfo();

        Bmw bmw = new Bmw(2, 2, "BMW - TOYOTA", "HOME", "Germani", "AVK8235899087", "Sedan", "525i", "E60");
        bmw.printInfo();

        Toyota toyota = new Toyota(2, 2, "BMW - TOYOTA", "HOME", "Japan", "VUI9273290G847", "Jeep", 14, 3.5);
        toyota.printInfo();
        System.out.println();

        Home home = new Home(2, 2, "BMW - TOYOTA", "HOME", "Vazgen Arajin 12/60", 1108);
        home.printInfo();

        Penthouse penthouse = new Penthouse(2, 2, "BMW - TOYOTA", "HOME", "Vazgen Arajin 12/60", 1108, "roof", 56.7);
        penthouse.printInfo();

        Apartment apartment = new Apartment(2, 2, "BMW - TOYOTA", "HOME", "Vazgen Arajin 12/60", 1108, 115.7, 5);
        apartment.printInfo();
    }
}
