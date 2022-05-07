package com.demo.progresstests.exam1.exercies18;
/*
Напишите класс, который заполняет случайными трехзначными числами массив,
размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива в одной строке,
начиная с «начала» массива (с первой ячейки).
 */

import java.util.Scanner;

public class Exercies18_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array length");
        int b = scanner.nextInt();

        int[] a = new int[b];
        int min = 100;
        int max = 999;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(a[i] + ", ");
        }
        scanner.close();
    }
}
