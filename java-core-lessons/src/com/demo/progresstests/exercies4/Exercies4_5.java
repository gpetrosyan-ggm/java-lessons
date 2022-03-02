package com.demo.progresstests.exercies4;
/*
Назовем «весом числа>> сумму· его цифр.
Напишите класс, который принимает с клавиатуры число (трехзначное) и выводит на экран его «вес»
 */

import java.util.Scanner;

public class Exercies4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eranish tiv...");

        int a = scanner.nextInt();
        System.out.println((a / 100) + a % 100 / 10 + a % 10);

        scanner.close();
    }
}
