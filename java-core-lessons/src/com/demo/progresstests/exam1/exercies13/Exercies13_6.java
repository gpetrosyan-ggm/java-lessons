package com.demo.progresstests.exam1.exercies13;
/*
Назовем «дважды четным» целое положительное число, если и оно само,
и сумма его делителей - четные числа.
Напишите класс, который принимает с клавиатуры целое положительное число и проверяет,
является ли оно «дважды четным».
 */

import java.util.Scanner;

public class Exercies13_6 {
    public static void main(String[] args) {
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" tiv ");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    b = b + i;
                }
            }
            if (b % 2 == 0) {
                System.out.println(" dzer tiv@ krknaki zuyd e");
            } else {
                System.out.println(" bajanararneri gumar@ kent e");
            }
        } else {
            System.out.println("krkin porci, tivt kent e");
        }
        scanner.close();
    }
}
