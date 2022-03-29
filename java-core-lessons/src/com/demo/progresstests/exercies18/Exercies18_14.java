package com.demo.progresstests.exercies18;
/*
Напишите класс, который заполняет случайными двузначными числами массив,
размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива следующим образом:
• в первой строке - значения из четных ячеек массива;
• во второй строке - значения из нечетных ячеек массива.
 */

import java.util.Scanner;

public class Exercies18_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array length");
        int b = scanner.nextInt();

        int[] a = new int[b];
        int min = 10;
        int max = 99;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1) + min);
            if (i % 2 == 0) {
                System.out.println(a[i] + " verevi tox");
            } else {
                System.out.println(a[i] + " nergevi tox");
            }
        }
        scanner.close();
    }
}
