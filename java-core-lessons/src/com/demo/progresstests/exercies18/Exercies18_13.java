package com.demo.progresstests.exercies18;
/*
Напишите класс, который заполняет случайными трехзначными числами массив,
размер которого при инициализации вводится с клавиатуры.
После заполнения класс должен вывести на экран значения массива следующим образом:
• в первой строке - первую половину массива;
• во второй строке - вторую половину массива.
В случае если массив имеет нечетный размер, центральную ячейку следует выводить в первой строке.
 */

import java.util.Scanner;

public class Exercies18_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array length");
        int b = scanner.nextInt();

        int[] a = new int[b];
        int min = 100;
        int max = 999;
        int c = a.length / 2;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        if (a.length % 2 != 0) {
            c++;
        }
        for (int j = 0; j < c; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
        for (int k = c; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
        scanner.close();
    }
}
