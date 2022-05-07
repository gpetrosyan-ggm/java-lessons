package com.demo.progresstests.exam1.exercies13;
/*
Напишите класс, который генерирует серию из 20 случайных положительных двузначных чисел
и определяет сумму четных значений в серии.
 */

public class Exercies13_2 {
    public static void main(String[] args) {
        int min = 10;
        int max = 99;
        int c = 0;
        for (int i = 1; i < 21; i++) {
            int a = (int) (Math.random() * (max - min + 1) + min);
            if (a % 2 == 0) {
                System.out.println(a + " - zuyg");
                c = c + a;
            } else {
                System.out.println(a + " - kent");
            }
        }
        System.out.println(c);
    }
}
