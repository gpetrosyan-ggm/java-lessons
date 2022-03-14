package com.demo.progresstests.exercies13;
/*
Назовем «дважды делимым» целое положительное число, если и оно само,
и сумма его делителей - делятся (без остатка, разумеется) на количество делителей числа.
Напишите класс, который принимает с клавиатуры целое положительное число и проверяет,
является ли оно «дважды делимым».
 */

import java.util.Scanner;

public class Exercies13_7 {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                c = c + i;
                b++;
            }
        }
        if (a % b == 0 && c % b == 0) {
            System.out.println("«дважды делимым»");
        } else {
            System.out.println("che chkpav");
        }
        scanner.close();
    }
}
