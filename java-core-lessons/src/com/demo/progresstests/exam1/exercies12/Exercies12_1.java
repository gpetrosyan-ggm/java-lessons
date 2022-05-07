package com.demo.progresstests.exam1.exercies12;
/*
Напишите класс, который принимает с клавиатуры 10 целых чисел и выводит на экран
информацию о том, сколько из них были положительными.
 */

import java.util.Scanner;

public class Exercies12_1 {
    public static void main(String[] args) {
        int a = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("tiv");
            int b = scanner.nextInt();

            if (b > 0) {
                a++;
            }

        }
        System.out.println("drakan tveri qanak@ " + a);

    }

}
