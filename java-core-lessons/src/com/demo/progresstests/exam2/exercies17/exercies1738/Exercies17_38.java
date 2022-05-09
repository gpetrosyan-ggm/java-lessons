package com.demo.progresstests.exam2.exercies17.exercies1738;
/*
Напишите метод, который получает в качестве параметров два значения - координаты (Х и У) точки А.
метод возвращает одно из значений 1, 2, 3 или 4 - в зависимости от того,
в какой четверти системы координат находится точка.
В случае если точка находится на, как минимум, одной из осей координат, метод возвращает -1.
 */

public class Exercies17_38 {

   int cordinat(int corX, int corY) {
        int dot;

        if (corX > 0 && corY > 0) {
            dot = 1;
        } else if (corX > 0 && corY < 0) {
            dot = 2;
        } else if (corX < 0 && corY < 0) {
            dot = 3;
        } else if (corX < 0 && corY > 0) {
            dot = 4;
        } else {
            dot = -1;
        }
        return dot;
    }
}
