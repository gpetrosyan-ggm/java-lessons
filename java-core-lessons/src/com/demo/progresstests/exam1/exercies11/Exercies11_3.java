package com.demo.progresstests.exam1.exercies11;
/*
Напишите вариант предыдущей задачи, исходя из того, что неизвестно,
какое из вводимых с клавиатуры значений больше, а какое - меньше.
 */

import java.util.Scanner;

public class Exercies11_3 {
    public static void main(String[] args) {
        int c = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        System.out.println("tiv ");
        int b = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            c = (int) (Math.random() * (a - b + 1) + b);
            System.out.println(c);

        }

        scanner.close();

    }
}
