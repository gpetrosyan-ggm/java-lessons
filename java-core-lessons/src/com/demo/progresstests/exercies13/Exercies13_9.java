package com.demo.progresstests.exercies13;
/*
Назовем «степенью близости» двух целых положительных чисел сумму их общих делителей.
Напишите класс, который принимает с клавиатуры два целых положительных числа
и определяет их «степень близости».
 */

import java.util.Scanner;

public class Exercies13_9 {
    public static void main(String[] args) {
        int c = 0;
        int d = 0;
        int f;
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        System.out.println("tiv");
        int b = scanner.nextInt();

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                c = c + i;
            }
        }
        for (int i = 1; i < b; i++) {
            if (b % i == 0) {
                d = d + i;
            }
        }
        f = c + d;
        System.out.println("«степенью близости» = " + f);
        scanner.close();
    }
}
