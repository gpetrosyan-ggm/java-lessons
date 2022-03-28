package com.demo.progresstests.exercies13;
/*
Напишите класс, который создает серию из диапазона 15 случайных чисел из - 30 ... + 30.
Класс будет выводить на экран только те числа серии, которые имеют такой же знак,
как и предшествующее им число (значение О считать положительным для данного задания).
 */

public class Exercies13_24 {
    public static void main(String[] args) {
        int start = -30;
        int finish = 30;

        int a = (int) (Math.random() * (finish - start + 1) + start);
        System.out.print(a + "   ");

        for (int i = 1; i < 25; i++) {

            int b = (int) (Math.random() * (finish - start + 1) + start);

            if (a >= 0 && b >= 0) {
                System.out.print(" " + b);
            } else if (a < 0 && b < 0) {
                System.out.print(" " + b);
            }
        }
    }
}
