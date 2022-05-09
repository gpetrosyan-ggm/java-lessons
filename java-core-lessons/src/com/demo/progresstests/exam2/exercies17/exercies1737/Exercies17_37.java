package com.demo.progresstests.exam2.exercies17.exercies1737;
/*
Напишите метод, который принимает две пары чисел: первая - координаты (Х и У) точки А,
вторая - координаты (Х и У) точки В. Метод возвращает длину отрезка АВ.
 */
public class Exercies17_37 {

    void cordinatAB(int corAx, int corAy, int corBx, int corBy){
        double distance;

        distance = Math.sqrt((corAx - corBx)*(corAx - corBx)+ (corAy - corBy)*(corAy - corBy));
        System.out.println(distance);
    }

}
