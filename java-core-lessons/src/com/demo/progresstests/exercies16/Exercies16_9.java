package com.demo.progresstests.exercies16;
/*
Целое число называется <<Полноценным», если сумма делителей
(включая 1, но, не включая само число) числа равна самому числу.
Напишите класс, который выводит на экран все «полноценные» числа от 1 до 100000.
 */

public class Exercies16_9 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100_000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.println(i + " liarjeq tiv e ");
            }
        }

    }
}
