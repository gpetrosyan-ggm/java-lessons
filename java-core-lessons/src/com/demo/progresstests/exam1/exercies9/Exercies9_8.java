package com.demo.progresstests.exam1.exercies9;
/*
Назовем билет с шестизначным номером «счастливым», если сумма первых трех его цифр
равна сумме последних трех его цифр и обе эти суммы являются четными.
Напишите класс, который принимает с клавиатуры шестизначный номер билета и проверяет,
является ли он «счастливым» или не является.
 */

import java.util.Scanner;

public class Exercies9_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("vecanish");
        int a = scanner.nextInt();

        int a100000 = a / 100000;
        int a10000 = a / 10000 % 10;
        int a1000 = a / 1000 % 10;
        int a100 = a / 100 % 10;
        int a10 = a / 10 % 10;
        int a1 = a % 10;
        int a2 = a100000 + a10000 + a1000;
        int a3 = a100 + a10 + a1;

        if (a2 == a3 && a % 2 == 0) {
            System.out.println("toms@ hajoxak e");

        } else {
            System.out.println("anhajox toms");
        }
        scanner.close();
    }
}
