package com.demo.progresstests.exercies10;
/*
Напишите класс, который генерирует два случайных положительных двузначных числа,
обозначающих границы некоторого интервала, а затем генерирует три целых
положительных числа внутри данного интервала.
 */

public class Exercies10_4 {
    public static void main(String[] args) {
        int min = 10;
        int max = 99;
        int b;

        int a1 = (int) (Math.random() * (max - min + 1) + min);
        int a2 = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(a1 + " " + a2);

        if (a1 > a2) {
            for (int i = 0; i < 3; i++) {
                b = (int) (Math.random() * (a1 - a2 + 1) + a2);
                System.out.println(b);
            }

        } else if (a1 < a2) {
            for (int i = 0; i < 3; i++) {
                b = (int) (Math.random() * (a2 - a1 + 1) + a1);
                System.out.println(b);
            }
        } else {

            System.out.println("chkpav");

        }
    }
}
