package com.demo.progresstests.exam2.exercies17.exercies1739;
/*
Напишите метод, который принимает две пары чисел:
первая - координаты (Х и У) точки А,
вторая - координаты (Х и У) точки В.
Метод возвращает значение true, если отрезок пересекает хотя бы одну ось координат;
в ином случае метод возвращает значение
 */

public class Exercies17_39 {
    void cordinatAB(int corAx, int corAy, int corBx, int corBy) {
        boolean cor = true;
        boolean corAx1 = true;
        boolean corAy1 = true;
        boolean corBx1 = true;
        boolean corBy1 = true;
        if (corAx < 0) {
            corAx1 = false;
        }
        if (corAy < 0) {
            corAy1 = false;
        }
        if (corBx < 0) {
            corBx1 = false;
        }
        if (corBy < 0) {
            corBx1 = false;
        }
        if (corAx1 == corBx1 && corAy1 == corBy1 && corAx1 == corAy1) {
            cor = false;
        }
        System.out.println(cor);
    }
}
