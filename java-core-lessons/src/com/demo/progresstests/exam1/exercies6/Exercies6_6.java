package com.demo.progresstests.exam1.exercies6;
/*
Трехзначное положительное число называется «четно-красивым»,
если каждая из его цифр - четная. Напишите класс, который принимает с
клавиатуры трехзначное число и проверяет, является ли оно «четно-красивым».
В соответствии с результатом проверки надо вывести на экран соответствующее
текстовое сообщение. Обратите внимание: задание имеет решение с использованием одного
оператора if и без составного условия!
 */

import java.util.Scanner;

public class Exercies6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eranish drakan tiv..");

        int a = scanner.nextInt();
        int a100 = a / 100;
        int a10 = a / 10 % 10;
        int a1 = a % 10;
        if (a100 % 2 == 0 && a10 % 2 == 0 && a1 % 2 == 0) {
            System.out.println("es inch gold tiva");
        }
        scanner.close();
    }
}
