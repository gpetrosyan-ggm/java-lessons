package com.demo.progresstests.exercies16;
/*
Напишите класс, который будет выводить на экран делители каждого числа от 1 до 75.
 */

public class Exercies16_6 {
    public static void main(String[] args) {
        for (int i = 1; i < 76; i++) {

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    System.out.println(i + " : " + j);
                }
            }
        }
    }
}
