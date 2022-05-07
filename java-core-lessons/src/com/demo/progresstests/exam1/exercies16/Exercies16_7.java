package com.demo.progresstests.exam1.exercies16;
/*
Напишите класс, который будет выводить на экран суммы делителей каждого числа от 1 до 75.
 */

public class Exercies16_7 {
    public static void main(String[] args) {

        for (int i = 1; i < 76; i++) {
            int k = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    k += j;
                }
            }
            if (k > 0) {
                System.out.println(i + " bajanararneri gumar " + k);
            }
        }
    }
}
