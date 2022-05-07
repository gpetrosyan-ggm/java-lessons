package com.demo.progresstests.exam1.exercies13;
/*
Напишите класс, который создает серию из диапазона 25 случайных чисел из 10 ... 99.
Класс будет выводить на экран только те числа серии,
которые делятся без остатка на первое число в серии.
 */

public class Exercies13_23 {
    public static void main(String[] args) {

        int start = 10;
        int finish = 99;

        int a = (int) (Math.random() * (finish - start + 1) + start);
        System.out.print(a + "   ");

        for (int i = 1; i < 25; i++) {

            int b = (int) (Math.random() * (finish - start + 1) + start);

            if (b % a == 0) {
                System.out.print(" " + b);
            }
        }
    }
}
