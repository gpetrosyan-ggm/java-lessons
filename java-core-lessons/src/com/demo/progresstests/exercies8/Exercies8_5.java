package com.demo.progresstests.exercies8;
/*
Напишите класс, который принимает с клавиатуры целое число и выводит на экран его квадрат,
но только в случае, если введенное число отрицательно. В противном случае - на экран
выводится сообщение Ошибка.
 */

import java.util.Scanner;

public class Exercies8_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("amboxjakan kamayakan tiv ..");

        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println(a * a);
        } else {
            System.out.println("Ошибка");
        }
        scanner.close();
    }
}
