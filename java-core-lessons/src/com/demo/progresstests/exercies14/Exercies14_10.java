package com.demo.progresstests.exercies14;
/*
Напишите класс, который генерирует 25 целых положительных трехзначных чисел
и выводит на экран порядковый номер числа, сумма цифр которого была максимальной.
 */

public class Exercies14_10 {
    public static void main(String[] args) {
        int start = 100;
        int end = 999;
        int c = 1;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 25; i++) {

            int b = (int) (Math.random() * (end - start + 1) + start);
            System.out.print(" " + b);

            int b100 = b / 100;
            int b10 = b / 10 % 10;
            int b1 = b % 10;
            int bb = b100 + b10 + b1;

            if (bb > max) {
                max = bb;
                c=i;
            }
        }
        System.out.println();
        System.out.println(c);
    }
}
