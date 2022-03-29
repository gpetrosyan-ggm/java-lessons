package com.demo.progresstests.exercies18;
/*
Напишите класс, который заполняет случайными четырехзначными числами массив,
размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива в одной строке,
начиная с «конца>> массива (с последней ячейки).
 */

import java.util.Scanner;

public class Exercies18_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array length");
        int b = scanner.nextInt();

        int[] a = new int[b];
        int min = 1000;
        int max = 9999;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        for (int j = a.length - 1; j >= 0; j--) {
            System.out.println(a[j] + " ");
        }
        scanner.close();
    }
}
