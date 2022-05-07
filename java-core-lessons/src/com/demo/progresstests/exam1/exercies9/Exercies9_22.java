package com.demo.progresstests.exam1.exercies9;
/*
Целое трехзначное число называется «горой», если его средняя цифра больше крайних.
Напишите класс, который принимает с клавиатуры положительное трехзначное число
и проверяет, является ли оно «горой».
 */

import java.util.Scanner;

public class Exercies9_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("eranish tiv");
        int a = scanner.nextInt();

        int a100 = a / 100;
        int a10 = a / 10 % 10;
        int a1 = a % 10;

        if (a10 > a100 && a10 > a1) {
            System.out.println("camel");

        } else {
            System.out.println("chi handisanum vorpes sapat");
        }
        scanner.close();
    }
}
