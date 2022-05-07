package com.demo.progresstests.exam1.exercies14;
/*
Напишите класс, который генерирует 15 целых положительных трехзначных чисел
и выводит на экран число, сумма цифр которого была минимальной.
 */

public class Exercies14_8 {
    public static void main(String[] args) {
        int start = 100;
        int and = 999;
        int c =0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 15; i++) {

            int b = (int) (Math.random() * (and - start + 1) + start);
            System.out.print(" " + b);

            int b100 = b / 100;
            int b10 = b / 10 % 10;
            int b1 = b % 10;
            int bb = b100 + b10 + b1;

            if (min > bb) {
                min = bb;
                c = b;
            }
        }
        System.out.println();
        System.out.println(c + "   " + min);
    }
}
