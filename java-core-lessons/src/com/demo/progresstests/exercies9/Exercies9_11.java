package com.demo.progresstests.exercies9;
/*
Трехзначное число называется «поднимающимся», если оно составлено из цифр,
расположенных в порядке возрастания (наименьшая - первая, наибольшая - последняя,
все цифры разные; например - 123).
Напишите класс, который принимает с клавиатуры трехзначное число и проверяет,
является ли оно «поднимающимся». В соответствии с результатом проверки надо вывести
на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies9_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("eranish tiv");
        int a = scanner.nextInt();

        int a100 = a / 100;
        int a10 = a / 10 % 10;
        int a1 = a % 10;
        if (a100 < a10 && a10 < a1) {
            System.out.println("ajox");

        } else {
            System.out.println("chi ajum");
        }
        scanner.close();
    }
}
