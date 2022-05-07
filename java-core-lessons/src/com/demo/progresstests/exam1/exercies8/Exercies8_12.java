package com.demo.progresstests.exam1.exercies8;
/*
Трехзначное число называется «дважды четным», если и оно само, и сумма его цифр - четные.
Напишите класс, который принимает с клавиатуры трехзначное положительное число и проверяет,
является ли оно «дважды четным».
В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
Обратите внимание: задание имеет решение с использованием единственного оператора
if- без составного условия!
 */

import java.util.Scanner;

public class Exercies8_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eranish tiv");

        int a = scanner.nextInt();
        int a100 = a / 100;
        int a10 = a / 10 % 10;
        int a1 = a % 10;
        int a2 = a100 + a10 + a1;
        if (a % 2 == 0 && a2 % 2 == 0) {
            System.out.println("krknaki zuyg");
        } else {
            System.out.println("tiv@ krknaki zuyg che");
        }
        scanner.close();
    }
}
