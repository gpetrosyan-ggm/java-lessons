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
        int a234 = a % 1000;
        int a4 = a % 10;
        int a1 = a / 1000;
        System.out.println(a234 - a4 + a4 * 1000 + a1);

        scanner.close();
    }
}
