package com.demo.progresstests.exercies16;
/*
Напишите класс, который выводит на экран все простые двузначные числа,
квадрат которых не превышает 999.
 */

public class Exercies16_16 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            int x = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    x++;
                }
            }
            if (x == 0 && i * i < 999) {
                System.out.println(i);
            }
        }
    }
}
