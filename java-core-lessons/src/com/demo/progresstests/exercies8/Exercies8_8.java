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
        int a10 = a / 10;
        int a1 = a % 10;
        int b10 = b / 10;
        int b1 = b % 10;
        if (a10 == a1) {
            System.out.println("1-in tiv@ kazmvac e mievnuyn tveric ");
        } else {
            System.out.println("kazmvac chen mievnuyn tveric");
        }
        if (b10 == b1) {
            System.out.println("2-rd tiv@ kazmvac e mievnuyn tveric ");
        } else {
            System.out.println(" kazmvac chen mievnuyn tveric");

        }
        scanner.close();
    }
}
