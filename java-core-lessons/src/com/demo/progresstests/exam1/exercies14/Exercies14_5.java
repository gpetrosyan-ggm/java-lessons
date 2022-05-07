package com.demo.progresstests.exam1.exercies14;
/*
Напишите класс, который принимает с клавиатуры серию из 12 целых чисел и определяет
среднее арифметическое максимума и минимума для этой серии.
 */

import java.util.Scanner;

public class Exercies14_5 {
    public static void main(String[] args) {
        int c;
        int k; // Sensey stex nax@ntreli cher haytararel double, qani vor gumar@ kara kent tiv ta isk mijin@ kotoraain
               // te es paragayum da etqan el eyakan chi։ es testeri paragayum eakan chi, bayc irakanum ete bajanum ka uremn double arji, ete konkret int chen uzum.
        Scanner scanner = new Scanner(System.in);

        System.out.println(" tiv ");
        int a = scanner.nextInt();
        c = a;

        for (int i = 1; i < 12; i++) {
            System.out.println(" tiv ");
            int b = scanner.nextInt();

            if (b > c) {
                c = b;
            } else if (b < a) {
                a = b;
            }
        }
        k = (c + a) / 2;
        System.out.println(a + "  " + c + "  " + k);
        scanner.close();
    }
}
