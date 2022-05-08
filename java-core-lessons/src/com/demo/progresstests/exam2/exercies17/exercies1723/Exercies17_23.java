package com.demo.progresstests.exam2.exercies17.exercies1723;
/*
Напишите метод, который принимает в качестве параметров коэффициенты квадратного уравнения
(а, Ь и с) и возвращает количество решений этого уравнения.
 */
// a *x*x + b * x + c = 0;
//(x + x1) * (x + x2) = 0;
// x1,x2 = (-b+-armat D)/2a

public class Exercies17_23 {
    int count = 0;
    void equations(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        if (d < 0) {
            count = 0;
        } else if (a != 0) {
            count = 2;
        } else {
            count = 1;
        }
        System.out.println(count);
    }
}
