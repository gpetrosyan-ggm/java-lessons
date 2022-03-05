package com.demo.progresstests.exercies9;
/*
Назовем двузначное число «внутренним» по отношению к четырехзначному числу,
если какая-то пара смежных цифр в четырехзначном числе образует двузначное число.
Напишите класс, который принимает с клавиатуры два положительных числа - двузначное
и четырехзначное - и проверяет, является ли двузначное «внутренним» по отношению к четырехзначному.
 */

import java.util.Scanner;

public class Exercies9_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("erknish tiv");
        int a = scanner.nextInt();

        System.out.println("qaranish tiv");
        int b = scanner.nextInt();

        int b1 = b % 100;
        int b2 = (b / 10) % 100;
        int b3 = b / 100;

        if (a == b1) {
            System.out.println("nerqin e");

        } else if (a == b2) {
            System.out.println("nerqin e");

        } else if (a == b3) {
            System.out.println("nerqin e");

        } else {
            System.out.println("artaqin");
        }
        scanner.close();
    }
}
