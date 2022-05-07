package com.demo.progresstests.exam1.exercies9;
/*
Трехзначное число называется «опускающимся», если оно составлено из цифр,
расположенных в порядке убывания (наибольшая - первая, наименьшая - последняя,
все цифры разные; например - 321).
Напишите класс, который принимает с клавиатуры трехзначное число и проверяет,
является ли оно «опускающимся». В соответствии с результатом проверки надо вывести
на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies9_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("eranish tiv");
        int a = scanner.nextInt();

        int a100 = a / 100;
        int a10 = a / 10 % 10;
        int a1 = a % 10;

        if (a100 > a10 && a10 > a1) {
            System.out.println("nvazox");

        } else {
            System.out.println("chi hamapatasxanum ");
        }
        scanner.close();
    }
}
