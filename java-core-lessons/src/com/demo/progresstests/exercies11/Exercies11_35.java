package com.demo.progresstests.exercies11;
/*
Напишите класс, который принимает с клавиатуры целое число N,
а затем принимает с клавиатуры N целых чисел.
Для каждого вводимого с клавиатуры неотрицательного числа следует
вывести на экран его квадрат, а для остальных чисел - текст Пропускаем.
 */

import java.util.Scanner;

public class Exercies11_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("shat poqr tiv");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("drakan u bacasakan tiv tiv");
            int b = scanner.nextInt();
            if (b > 0) {
                System.out.println(b + " ");
            } else {
                System.out.println("bac toxum");

            }
        }

    }
}
