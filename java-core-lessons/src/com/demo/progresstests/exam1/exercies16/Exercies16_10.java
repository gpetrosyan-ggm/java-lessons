package com.demo.progresstests.exam1.exercies16;
/*
Напишите класс, который принимает с клавиатуры целое число, а затем проверяет,
можно ли представить его в виде суммы квадратов двух целых чисел.
 */

import java.util.Scanner;

public class Exercies16_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("num");
        int num = scanner.nextInt();

        for (int i = 1; i < num; i++) {

            for (int j = 1; j <= i; j++) {

                int c = i * i + j * j;
                if (c == num) {
                    System.out.println(i + " * " + i + " + " + j + " * " + j + " = " + num);
                }
            }
        }
        scanner.close();
    }
}
