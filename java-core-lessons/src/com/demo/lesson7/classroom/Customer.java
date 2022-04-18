package com.demo.lesson7.classroom;

public class Customer {

    String name;
    int age;
    String email;
    String phone;
    Car car;

    public Customer(Car car) {
        this.car = car;
    }

    public void carInfo() {
        System.out.println(this.car.color);
    }

}
