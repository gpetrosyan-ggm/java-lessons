package com.demo.progresstests.exercies8;
/*
Напишите класс, который принимает с клавиатуры трехзначное положительное число и проверяет,
содержится ли в нем хотя бы один ноль.
По результатам проверки надо вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies8_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eranish");

        int a = scanner.nextInt();
        if (a / 10 % 10 == 0 || a % 10 == 0) {
            System.out.println("zro ka");
        } else {
            System.out.println("chka zro");
        }
        scanner.close();
    }
}
