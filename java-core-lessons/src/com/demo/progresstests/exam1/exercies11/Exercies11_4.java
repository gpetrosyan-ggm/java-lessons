package com.demo.progresstests.exam1.exercies11;
/*
Напишите класс, который выводит на экран (в одну строку) 15 случайных чисел
из диапазона -20...+35. После каждого отрицательного числа следует вывести
(вплотную к числу) символ«?» (знак вопроса).
 */

public class Exercies11_4 {
    public static void main(String[] args) {

        int min = -20;
        int max = 35;
        int a;
        for (int i = 0; i < 15; i++) {
            a = (int) (Math.random() * (min - max + 1) + max);
            if (a < 0) {
                System.out.print(" " + a + "?");
            } else {
                System.out.print(" " + a);
            }
        }

    }
}
