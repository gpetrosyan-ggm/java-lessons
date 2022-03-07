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
        int a1 = 0;
        int a2 = 0;
        int b1 = 0;
        int b2 = 0;
        int b3 = 0;

        a1 = (int) (Math.random() * (max - min + 1) + min);
        a2 = (int) (Math.random() * (max - min + 1) + min);

        if (a1 > a2) {

            b1 = (int) (Math.random() * (a1 - a2 + 1) + a2);
            b2 = (int) (Math.random() * (a1 - a2 + 1) + a2);
            b3 = (int) (Math.random() * (a1 - a2 + 1) + a2);

        } else if (a1 < a2) {

            b1 = (int) (Math.random() * (a2 - a1 + 1) + a1);
            b2 = (int) (Math.random() * (a2 - a1 + 1) + a1);
            b3 = (int) (Math.random() * (a2 - a1 + 1) + a1);
        } else {

            System.out.println("chkpav");

        }
        System.out.println(a1 + " " + a2);
        System.out.println(b1 + " " + b2 + " " + b3);
    }
}
