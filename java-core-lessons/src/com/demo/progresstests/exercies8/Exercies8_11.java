package com.demo.progresstests.exercies8;
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
        if (a / 100 == a % 10) {
            System.out.println("simetrik e");
        } else {
            System.out.println("voch simetrik");
        }
        scanner.close();
    }
}
