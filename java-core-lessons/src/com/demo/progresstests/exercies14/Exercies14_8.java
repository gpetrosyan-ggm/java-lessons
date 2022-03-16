package com.demo.progresstests.exercies14;
/*
Напишите класс, который генерирует 15 целых положительных трехзначных чисел
и выводит на экран число, сумма цифр которого была минимальной.
 */

public class Exercies14_8 {
    public static void main(String[] args) {
        int start = 100;
        int and = 999;

        int a = (int) (Math.random() * (and - start + 1) + start);
        System.out.print(a);
        int c = a;

        int a100 = a / 100;
        int a10 = a / 10 % 10;
        int a1 = a % 10;
        int aa = a100 + a10 + a1;

        for (int i = 1; i < 15; i++) {

            int b = (int) (Math.random() * (and - start + 1) + start);
            System.out.print(" " + b);

            int b100 = b / 100;
            int b10 = b / 10 % 10;
            int b1 = b % 10;
            int bb = b100 + b10 + b1;

            if (aa > bb) {
                aa = bb;
                c = b;
            }
        }
        System.out.println();
        System.out.println(c + "   " + aa);
    }
}
