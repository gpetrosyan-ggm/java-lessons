package com.demo.progresstests.exam2.exercies17.exercies1721;
/*
Напишите метод, который принимает в качестве параметров координаты точки на плоскости (Х и У)
и возвращает расстояние между этой точкой и началом координат.
 */

public class Exercies17_21 {

    void coordinates(int x, int y) {
        double distance;
        distance = Math.sqrt(x * x + y * y);
        System.out.println(distance);
    }
}
