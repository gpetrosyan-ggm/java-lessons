package com.demo.lesson8.classroom;

import java.time.LocalDateTime;

public class CarDemo {

    public static void main(String[] args) {
        CarBMW carBmw = new CarBMW(LocalDateTime.of(2020, 6, 15, 0, 0, 0), "asda65314a6s1d6asd", 320, "X6");
//        carBmw.mark = "X6";
//        carBmw.speed = 320;
//        carBmw.vinCode = "asda65314a6s1d6asd";
//        carBmw.releaseDate = LocalDateTime.of(2020, 6, 15, 0, 0, 0);
//        carBmw.printInfo();
        carBmw.printCountry();
        carBmw.printType();
        System.out.println();

//        Car car = new Car(LocalDateTime.of(2020, 6, 15, 0, 0, 0), "asda65314a6s1d6asd");
////        car.vinCode = "asda65314a6s1d6asd";
////        car.releaseDate = LocalDateTime.of(2020, 6, 15, 0, 0, 0);
////        car.printVinCode();
//        car.printCountry();
//        System.out.println();
//
//        CarHonda carHonda = new CarHonda(LocalDateTime.of(2010, 6, 15, 0, 0, 0), "asdasdasdasdasd", 5, "Odyssey");
////        carHonda.name = "Odyssey";
////        carHonda.doors = 5;
////        carHonda.vinCode = "asdasdasdasdasd";
////        carHonda.releaseDate = LocalDateTime.of(2010, 6, 15, 0, 0, 0);
//        carHonda.printCountry();
////        carHonda.printInfo();
//
//        Car car2 = new CarBMW(LocalDateTime.of(2020, 6, 15, 0, 0, 0), "asda65314a6s1d6asd");
////        car.mark = "X6";
////        car.speed = 320;
////        car.vinCode = "asda65314a6s1d6asd";
////        car.releaseDate = LocalDateTime.of(2020, 6, 15, 0, 0, 0);
////        car.printInfo();
//        carHonda.printCountry();
//        System.out.println();
    }

    public void print(Car car) {
        car.printVinCode();
    }

}
