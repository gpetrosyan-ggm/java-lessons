package com.demo.progresstests.exercies10;
/*
Напишите класс, который генерирует и выводит на экран случайное
целое чисел из диапазона положительных двузначных чисел.
 */

public class Exercies10_1 {
    public static void main(String[] args) {

        int min = 10;
        int max = 100;
        int a;
        for (int i = 0; i < 5; i++) {
            a = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(a);
        }

    }
}
