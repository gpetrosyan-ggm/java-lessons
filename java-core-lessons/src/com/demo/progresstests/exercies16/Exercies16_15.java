package com.demo.progresstests.exercies16;
/*
Напишите класс, который выводит на экран все положительные четные двузначные числа,
сумма делителей которых тоже является четным числом.
 */

public class Exercies16_15 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i += 2) {
            int sum = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
