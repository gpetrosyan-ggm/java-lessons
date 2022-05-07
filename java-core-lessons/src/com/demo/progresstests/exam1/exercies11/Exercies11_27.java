package com.demo.progresstests.exam1.exercies11;
/*
Напишите класс, который выводит на экран (в строку с пробелами) все
двузначные целые положительные числа, в которых и цифра единиц, и
цифра десятков делятся без остатка на три.
 */

public class Exercies11_27 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            int i10 = i / 10;
            int i1 = i % 10;
            if (i1 != 0 && i10 % 3 == 0 && i1 % 3 == 0) {
                System.out.print(" " + i);
            }
        }
    }
}
