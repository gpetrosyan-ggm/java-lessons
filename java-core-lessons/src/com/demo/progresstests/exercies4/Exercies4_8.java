package com.demo.progresstests.exercies4;
/*
Назовем «перестановкой» операцию над числом, при которой его первая
и последняя цифры меняются местами.
Например, из числа 1234 получается число 4231.
Напишите программу, которая принимает с клавиатуры трехзначное число
и строит из него новое число методом «перестановки».
 */

import java.util.Scanner;

public class Exercies4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grel qaranish drakan tiv  ");

        int a = scanner.nextInt();
        System.out.println(a % 1000 - a % 10 + a % 10 * 1000 + a / 1000);

        scanner.close();
    }
}
