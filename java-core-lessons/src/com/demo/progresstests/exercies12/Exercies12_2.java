package com.demo.progresstests.exercies12;
/*
Напишите класс, который принимает с клавиатуры 15 целых чисел и выводит на экран
информацию о том, сколько из них были четными и сколько нечетными.
 */

import java.util.Scanner;

public class Exercies12_2 {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {

            System.out.println("tiv");
            int a = scanner.nextInt();

            if (a > 0) {
                b++;
            } else {
                c++;
            }
        }
        System.out.println("drakan tveri qanak@ " + b + " bacasakan tver@ " + c);
    }
}
