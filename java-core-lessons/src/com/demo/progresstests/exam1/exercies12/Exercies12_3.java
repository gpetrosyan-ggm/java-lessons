package com.demo.progresstests.exam1.exercies12;
/*
Напишите класс, который принимает с клавиатуры 12 целых чисел и выводит на экран
информацию о том, сколько из них были больше, чем первое число.
 */

import java.util.Scanner;

public class Exercies12_3 {
    public static void main(String[] args) {
        int c = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println("tiv");
            int b = scanner.nextInt();
            if (b > a) {
                c++;
            }
        }
        System.out.println(c);
    }
}
