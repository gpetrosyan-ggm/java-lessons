package com.demo.progresstests.exam1.exercies4;
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
        int a100 = a / 100;
        int a10 = a % 100 / 10;
        int a1 = a % 10;
        System.out.println(a100 + a10 + a1);

        scanner.close();
    }
}
