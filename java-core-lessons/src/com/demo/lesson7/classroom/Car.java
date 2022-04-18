package com.demo.lesson7.classroom;

public class Car {

    String type;
    int speed;
    String color;

    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public Car(String type, int speed, String color) {
        this.type = type;
        this.speed = speed;
        this.color = color;
    }

    public Car(String type) {
        this.type = type;
    }

    public Car(String color, String type) {
        this.type = type;
        this.color = color;
    }

    public String info() {
        System.out.println("AAAAAAAAAA");
        return "A";
    }

    public static void info(Car c) {
        c.color = "Yellow";
        c.speed = 100;
    }

    public static void info(int a) {
        a = 10;
    }

    public static void main(String[] args) {
        Car car = new Car("Red", 200);
        System.out.println(car);

        info(car);
        System.out.println(car);

        int a = 20;
        System.out.println(a);
        info(a);
        System.out.println(a);
    }

    @Override
    public String toString() {
        return "Car{" +
               "type='" + type + '\'' +
               ", speed=" + speed +
               ", color='" + color + '\'' +
               '}';
    }
}
