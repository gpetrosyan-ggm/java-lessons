package com.demo.progresstests.exam1.exercies18;
/*
Напишите класс, который заполняет случайными двузначными числами массив,
размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива следующим образом:
• в первой строке - значения из первой половины массива, начиная с «начала));
• во второй строке - значения из второй половины массива, начиная с «КОНЦЮ).
 */

import java.util.Scanner;

public class Exercies18_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array length");
        int b = scanner.nextInt();

        int[] a = new int[b];
        int min = 10;
        int max = 99;
        int c = a.length / 2;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1) + max);
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int j = 0; j < c; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
        for (int k = a.length - 1; k >= c; k--) {
            System.out.print(a[k] + " ");
        }
        scanner.close();
    }
}
