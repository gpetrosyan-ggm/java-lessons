package com.demo.lesson9.homework.tnayin;

public class Persone {
    Home home;
    Car car;
    Work work;

    public Persone(Home home, Car car, Work work) {
        this.home = home;
        this.car = car;
        this.work = work;
    }

    public void personInfo() {
        home.homeInfo();
        car.carInfo();
        work.workInfo();
    }
}
