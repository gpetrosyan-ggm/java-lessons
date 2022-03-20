package com.demo.progresstests.exercies2;
/*
Напишите класс, который принимает с клавиатуры три числа:
значения оснований трапеции и ее высоту.
Класс должен подсчитать и вывести на экран площадь этой трапеции.
 */

import java.util.Scanner;

public class Exercies2_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sexani himqeric mek@ ...");

        int a = scanner.nextInt();
        System.out.println("sexani 2-rd himq@ ...");

        int b = scanner.nextInt();
        System.out.println("sexani bardrutyun ...");

        int h = scanner.nextInt();
        System.out.println("sexani makeres@ klini S = " + ((a + b) / 2 * h));

        scanner.close();
    }
}
