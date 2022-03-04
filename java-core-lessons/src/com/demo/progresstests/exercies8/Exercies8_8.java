package com.demo.progresstests.exercies8;
/*
Напишите класс, который принимает с клавиатуры двузначное положительное число и проверяет,
составлено ли оно из одинаковых цифр.
В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies8_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("erknish drakan tiv ");

        int a = scanner.nextInt();
        System.out.println("erknish drakan tiv ");

        int b = scanner.nextInt();
        if (a == b || (a % 10 == b / 10 && a / 10 == b % 10)) {
            System.out.println("nranq kazmvac en mievnuyn tveric ");
        } else {
            System.out.println("kazmvac chen mievnuyn tveric");
        }
        scanner.close();
    }
}
