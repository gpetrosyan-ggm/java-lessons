package com.demo.progresstests.exam1.exercies8;
/*
Трехзначное число называется «симметричным», если первая и последняя его цифры одинаковы.
Напишите класс, который принимает с клавиатуры трехзначное положительное число и проверяет,
является ли оно «симметричным».
В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies8_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eranish drakan tiv ");

        int a = scanner.nextInt();
        int a100 = a / 100;
        int a1 = a % 10;
        if (a100 == a1) {
            System.out.println("simetrik e");
        } else {
            System.out.println("voch simetrik");
        }
        scanner.close();
    }
}
