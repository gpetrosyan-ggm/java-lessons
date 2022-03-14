package com.demo.progresstests.exercies13;
/*
Два положительных целых числа называются «четно-близкими по сумме»,
если сумма их общих делителей является четным числом.
Напишите класс, который принимает с клавиатуры два целых положительных числа и проверяет,
являются ли они «четно-близкими по сумме».
 */

import java.util.Scanner;

public class Exercies13_8 {
    public static void main(String[] args) {
        int c = 0;
        int d = 0;
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
        if (c % 2 == 0 && d % 2 == 0) {
            System.out.println("«четно-близкими по сумме»");
        } else {
            System.out.println("noric porci");
        }
        scanner.close();
    }
}
