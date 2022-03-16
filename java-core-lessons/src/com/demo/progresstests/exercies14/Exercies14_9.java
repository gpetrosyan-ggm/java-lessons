package com.demo.progresstests.exercies14;
/*
Напишите класс, который генерирует 24 целых трехзначных положительных числа
и выводит на экран порядковый номер самого большого из сгенерированных чисел.
 */

public class Exercies14_9 {
    public static void main(String[] args) {
        int start = 100;
        int end = 999;
        int c = 1;

        int a = (int) (Math.random() * (end - start + 1) + start);
        System.out.print(a);

        for (int i = 1; i < 24; i++) {

            int b = (int) (Math.random() * (end - start + 1) + start);
            System.out.print(" " + b);

            if (b > a) {
                a = b;
                c++;
            }
        }
        System.out.println();
        System.out.println(c + "  " + a);
    }
}
