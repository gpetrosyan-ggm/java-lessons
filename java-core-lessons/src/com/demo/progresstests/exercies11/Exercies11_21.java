package com.demo.progresstests.exercies11;
/*
Напишите класс, который выводит на экран положительные трехзначные числа,
делящиеся без остатка на 11 (начиная с наименьшего).
 */

public class Exercies11_21 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {

            if (i % 11 == 0) {
                System.out.println(i);
            }
        }
    }
}
