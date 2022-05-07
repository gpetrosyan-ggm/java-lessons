package com.demo.progresstests.exam1.exercies9;
/*
Целое трехзначное число называется «дважды четным», если и сумма его цифр,
и их произведение являются четными.
Напишите класс, который принимает с клавиатуры положительное
трехзначное число и проверяет, является ли оно «дважды четным».
 */

import java.util.Scanner;

public class Exercies9_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("eranish drakan");
        int a = scanner.nextInt();

        int a100 = a / 100;
        int a10 = a / 10 % 10;
        int a1 = a % 10;
        int a2 = a1 + a10 + a100;
        int a3 = a1 * a10 * a100;

        if (a2 % 2 == 0 && a3 % 2 == 0) {
            System.out.println("krknaki zuyg");

        } else {
            System.out.println("krkin porci");
        }
        scanner.close();
    }
}
