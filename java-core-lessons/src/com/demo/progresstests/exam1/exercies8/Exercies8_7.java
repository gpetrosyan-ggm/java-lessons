package com.demo.progresstests.exam1.exercies8;
/*
Напишите класс, который принимает с клавиатуры оценку ученика
(целое число) и проверяет, не является ли введенное значение ошибочным.
На экран должно выводиться соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies8_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ashakerti gnahatakan@ ");

        int a = scanner.nextInt();
        if (0 < a && a < 10) {
            System.out.println("ashakerti gnahatakan@ chisht e ");
        } else {
            System.out.println("gnahatakan@ chisht e trvac");
        }
        scanner.close();
    }
}
