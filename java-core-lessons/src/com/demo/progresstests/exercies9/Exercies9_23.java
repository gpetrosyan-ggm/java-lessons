package com.demo.progresstests.exercies9;
/*
Целое трехзначное число называется «ЯМОЙ», если его средняя цифра меньше крайних.
Напишите класс, который принимает с клавиатуры положительное
трехзначное число и проверяет, является ли оно «ЯМОЙ».
 */

import java.util.Scanner;

public class Exercies9_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("eranish tiv");
        int a = scanner.nextInt();

        int a100 = a / 100;
        int a10 = a / 10 % 10;
        int a1 = a % 10;

        if (a10 < a100 && a10 < a1) {
            System.out.println("xoroj");

        } else {
            System.out.println("krkin porci");
        }
        scanner.close();
    }
}
