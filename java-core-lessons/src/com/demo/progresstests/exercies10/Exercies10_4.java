package com.demo.progresstests.exercies10;
/*
Напишите класс, который генерирует два случайных положительных двузначных числа,
обозначающих границы некоторого интервала, а затем генерирует три целых
положительных числа внутри данного интервала.
 */

public class Exercies10_4 {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int a1 = 0;
        int a2 = 0;
        int b1 = 0;
        int b2 = 0;
        int b3 = 0;

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                a1 = (int) (Math.random() * (max - min + 1) + min);

            } else {
                a2 = (int) (Math.random() * (max - min + 1) + min);
                if (a1 != a2) {
                    for (int j = 0; j < 3; j++) {
                        if (j == 0 && a1 > a2) {
                            b1 = (int) (Math.random() * (a1 - a2 + 1) + a2);
                        } else if (j == 0 && a1 < a2) {
                            b1 = (int) (Math.random() * (a2 - a1 + 1) + a1);
                        }
                        if (j == 1 && a1 > a2) {
                            b2 = (int) (Math.random() * (a1 - a2 + 1) + a2);
                        } else if (j == 1 && a1 < a2) {
                            b2 = (int) (Math.random() * (a2 - a1 + 1) + a1);
                        } else {
                            if (j == 2 && a1 > a2) {
                                b3 = (int) (Math.random() * (a1 - a2 + 1) + a2);
                            } else if (j == 2 && a1 < a2) {
                                b3 = (int) (Math.random() * (a2 - a1 + 1) + a1);
                            }
                        }
                    }


                } else {
                    System.out.println("chkpav krkin porci");
                }
            }
        }
        System.out.println(a1 + " " + a2);
        System.out.println(b1 + " " + b2 + " " + b3);
    }
}
