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

        int a1 = (int) (Math.random() * (max - min + 1) + min);
        int a2 = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(a1 + " " + a2);

        if (a1 > a2) {
            for(int i = 0;i<3; i++){
               int b1 = (int) (Math.random() * (a1 - a2 + 1) + a2);
                System.out.println(b1 );
            }

        } else if (a1 < a2) {
            for(int j = 0;j<3;j++){
               int b2 = (int) (Math.random() * (a1 - a2 + 1) + a2);
                System.out.println( b2 );
            }
        } else {

            System.out.println("chkpav");

        }
    }
}
