package com.demo.progresstests.exam2.exercies17.exercies1739;
/*
Напишите метод, который принимает две пары чисел:
первая - координаты (Х и У) точки А,
вторая - координаты (Х и У) точки В.
Метод возвращает значение true, если отрезок пересекает хотя бы одну ось координат;
в ином случае метод возвращает значение
 */

public class Exercies17_39 {
    boolean cordinateAB(int corAx, int corAy, int corBx, int corBy) {


        boolean corAx1 = corAx >= 0;
        boolean corAy1 = corAy >= 0;
        boolean corBx1 = corBx >= 0;
        boolean corBy1 = corBy >= 0;

        return corAx1 == corBx1 && corAy1 == corBy1 && corAx1 == corAy1;
    }
}
