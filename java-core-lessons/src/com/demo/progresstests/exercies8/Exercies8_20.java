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
            Scanner scannerB = new Scanner(System.in);
            System.out.println("grel kotorakain tiv");

            double b = scannerB.nextDouble();
            System.out.println("tiv@ zuyg e " + (a * b));

            scannerB.close();
        } else {
            Scanner scannerC = new Scanner(System.in);
            System.out.println("amboxjakan tiv");

            int c = scannerC.nextInt();
            System.out.println("tiv@ kent e " + (a + c));
        }
        scanner.close();
    }
}
