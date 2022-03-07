package com.demo.progresstests.exercies11;
/*
Напишите вариант предыдущей задачи, исходя из того, что неизвестно,
какое из вводимых с клавиатуры значений больше, а какое - меньше.
 */

import java.util.Scanner;

public class Exercies11_3 {
    public static void main(String[] args) {
        int c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        System.out.println("tiv ");
        int b = scanner.nextInt();

        if (a > b) {
            for (int i = a; i < (20 + a); i++) {
                c = (int) (Math.random() * (a - b + 1) + b);
                System.out.println(c);
            }
        } else {
            for (int i = b; i < (20 + b); i++) {
                c = (int) (Math.random() * (b - a + 1) + a);
                System.out.println(c);
            }
        }
        scanner.close();

    }
}
