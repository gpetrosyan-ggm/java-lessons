package com.demo.progresstests.exam1.exercies12;
/*
Напишите класс, который принимает с клавиатуры 17 целых чисел и выводит на экран
информацию о том, сколько из них были больше, чем предыдущее число.
 */

import java.util.Scanner;

public class Exercies12_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tiv");

        int a = scanner.nextInt();

        int b = 0;
        int c ;
        for (int i = 1; i < 17; i++) {
            c = a;

            System.out.println("tiv");
            a = scanner.nextInt();

            if (a > c) {
                b++;
            }
        }
        System.out.println("hajord@ naxordic aveli mec e " + b + "-ov");
    }
}
