package com.demo.progresstests.exam1.exercies11;
/*
Напишите класс, который выводит на экран целые положительные
трехзначные числа, составленные целиком из четных цифр.
 */

public class Exercies11_25 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {

            int i100 = i / 100;
            int i10 = i / 10 % 10;
            int i1 = i % 10;

            if (i100 % 2 == 0 && i10 % 2 == 0 && i1 % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
