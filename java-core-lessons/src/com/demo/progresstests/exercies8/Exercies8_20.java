package com.demo.progresstests.exercies8;
/*
Напишите класс, который принимает с клавиатуры целое положительное число, и затем:
    • в случае если введено четное число, - принимает с клавиатуры
      дробное число и выводит на экран произведение этих двух чисел;
    • в противном случае - принимает с клавиатуры целое число
      и выводит на экран сумму этих двух чисел.
 */

import java.util.Scanner;

public class Exercies8_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("drakan tiv");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("grel kotorakain tiv");
            double b = scanner.nextDouble();

            System.out.println("tiv@ zuyg e " + (a * b));
        } else {
            System.out.println("amboxjakan tiv");
            int c = scanner.nextInt();

            System.out.println("tiv@ kent e " + (a + c));
        }
        scanner.close();
    }
}
