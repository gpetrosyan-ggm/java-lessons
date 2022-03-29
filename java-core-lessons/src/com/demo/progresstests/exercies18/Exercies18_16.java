package com.demo.progresstests.exercies18;
/*
Напишите класс, который заполняет случайными трехзначными числами массив,
размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива следующим образом:
в каждой строке выводится значения из двух ячеек,
симметрично расположенных по отношению к середине массива.
В случае если массив имеет нечетный размер,
центральную ячейку следует выводить в отдельной строке.
Например, массив 345, 455, 677, 175, 985 выводится на экран следующим образом:
345 и 985
455 и 175
677
 */

import java.util.Scanner;

public class Exercies18_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array length");
        int b = scanner.nextInt();

        int[] a = new int[b];
        int min = 100;
        int max = 999;
        int k = b / 2;
        int c = b;
        for (int i = 0; i < b; i++) {
            a[i] = (int) (int) (Math.random() * (max - min + 1) + min);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < k; j++, c--) {
            System.out.println(a[j] + " ev " + a[c]);
        }
        if (b % 2 != 0) {
            System.out.println(a[k]);
        }
        scanner.close();
    }
}
