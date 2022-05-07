package com.demo.progresstests.exam1.exercies13;
/*
Напишите класс, который генерирует серию из 20 случайных положительных двузначных чисел
и определяет сумму значений в серии.
 */

public class Exercies13_1 {
    public static void main(String[] args) {
        int min = 10;
        int max = 99;
        int c = 0;

        for (int i = 1; i <= 20; i++) {
            int a = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(a);
            c = c + a;
        }
        System.out.println(c);
    }
}
