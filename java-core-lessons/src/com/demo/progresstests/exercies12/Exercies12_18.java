package com.demo.progresstests.exercies12;
/*
Назовем «степенью родства» двух целых положительных чисел количество их общих делителей.
Напишите класс, который принимает с клавиатуры два целых положительных числа
и определяет их «степень родства».
 */

import java.util.Scanner;

public class Exercies12_18 {
    public static void main(String[] args) {
        int c = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        System.out.println("tiv");
        int b = scanner.nextInt();
        if (a > b) {
            for (int i = 2; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    c++;
                }

            }
            System.out.println("" + c);
        } else {
            for (int i = 2; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    c++;
                }
            }
            System.out.println("" + c);
        }
    }
}
