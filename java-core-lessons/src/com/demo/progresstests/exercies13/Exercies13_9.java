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
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        System.out.println("tiv");
        int b = scanner.nextInt();

        int k = a > b ? b : a;
        for (int i = 1; i < k; i++) {
            if (a % i == b % i) {
                c = c + i;
            }
        }
        System.out.println("«степенью близости» = " + c);
        scanner.close();
    }
}
