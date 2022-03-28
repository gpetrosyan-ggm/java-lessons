package com.demo.progresstests.exercies14;
/*
Напишите класс, который генерирует 20 целых положительных двузначных чисел
и выводит на экран число, сумма цифр которого была максимальной.
 */

public class Exercies14_7 {
    public static void main(String[] args) {
        int start = 10;
        int and = 99;
        int c=0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < 20; i++) {
            int b = (int) (Math.random() * (and - start + 1) + start);
            System.out.print("  " + b);

            int b10 = b / 10;
            int b1 = b % 10;
            int bb = b10 + b1;

            if (bb > max) {
                max = bb;
                c = b;
            }
        }
        System.out.println();
        System.out.println(c + " ; " + max);
    }
}
