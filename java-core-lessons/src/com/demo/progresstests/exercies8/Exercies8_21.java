package com.demo.progresstests.exercies8;
/*
Симметричным («палиндромом») называется число, которое дает одинаковое значение
при чтении его справа налево и слева направо (например, 787).
Напишите класс, который принимает с клавиатуры положительное число
(не большее 99999) и проверяет, является ли это число палиндромом.
Класс должен выводить на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies8_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grel drakan minjev vecanish tiv");

        int a = scanner.nextInt();
        int a1 = (a / 100 % 10) * 10; //qaranish tiv
        int a2 = (a / 1000 % 10) * 10;//hnganish tiv
        if (a > 0 && a < 10) {
            System.out.println("simetrik e");
        } else if (a >= 10 && a <= 99 && (a / 10 == a % 10)) {
            System.out.println("simetrik e");
        } else if (a >= 100 && a <= 999 && (a / 100 == a % 10)) {
            System.out.println("simetrik e");
        } else if (a >= 1000 && a <= 9999 && (a1 + a / 1000 == a % 100)) {
            System.out.println("simetrik e");
        } else if (a >= 10000 && a <= 99999 && (a2 + a / 10000 == a % 100)) {
            System.out.println("simetrik e");
        } else {
            System.out.println("Dzer tiv@ simetrik che");
        }
        scanner.close();
    }
}
