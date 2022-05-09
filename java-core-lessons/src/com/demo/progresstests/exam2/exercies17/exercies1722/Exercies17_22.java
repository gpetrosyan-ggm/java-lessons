package com.demo.progresstests.exam2.exercies17.exercies1722;
/*
Напишите метод, который принимает в качестве параметра коэффициенты квадратного уравнения
(а, Ь и с) и возвращает значение true, если уравнение имеет хотя бы одно решение (корень).
В ином случае метод возвращает значение false.
 */

public class Exercies17_22 {
    public boolean equations(int a, int b, int c) {
        boolean root = false;
        if (a == 0 || (b * b - 4 * a * c) >= 0) {
            root = true;
        }
        return root;
    }
}
