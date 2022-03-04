package com.demo.progresstests.exercies8;
/*
Напишите класс, который принимает с клавиатуры целое число, и затем:
    • в случае если введено четное число, - принимает с клавиатуры дробное число
      и выводит на экран произведение этих двух чисел;
    • в противном случае - принимает с клавиатуры целое число
      и выводит на экран сумму этих двух чисел.
 */

import java.util.Scanner;

public class Exercies8_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("amboxjakan tiv");

        int a = scanner.nextInt();
        if (a % 2 == 0) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("kotorakayin mas");

            double a1 = scanner1.nextDouble();
            System.out.println("tiv@ zuyg e " + a * a1);
        } else {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("amboxjakan tiv");

            int a2 = scanner2.nextInt();
            System.out.println("tiv@ kent e " + (a + a2));
        }
    }
}
