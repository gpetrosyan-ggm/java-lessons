package com.demo.progresstests.exercies13;
/*
Последовательность Фибоначчи - последовательность целых чисел,
построенная по следующему правилу: каждый член последовательности,
начиная с 3-го, равен сумме двух предыдущих.
Напишите класс, который получает с клавиатуры два первых члена последовательности
и целое положительное число N. Класс подсчитает и выведет на экран сумму первых
N членов последовательности Фибоначчи.
 */

import java.util.Scanner;

public class Exercies13_15 {
    public static void main(String[] args) {
        int a3 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fibonachii arajin tiv@");
        int a1 = scanner.nextInt();

        System.out.println("Fibonachii erkrord tiv@");
        int a2 = scanner.nextInt();

        System.out.println("Fibonachii tveri qanak@");
        int b = scanner.nextInt();
        int fobin = a1 + a2;

        for (int i = 3; i <= b; i++) {

            a3 = a1 + a2;
            System.out.println(a3);

            fobin = fobin + a3;

            a1 = a2;
            a2 = a3;
        }
        System.out.println(fobin);
        scanner.close();
    }
}
