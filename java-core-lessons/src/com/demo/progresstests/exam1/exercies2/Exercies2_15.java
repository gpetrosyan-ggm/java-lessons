package com.demo.progresstests.exam1.exercies2;
/*
Напишите класс, который принимает с клавиатуры целое число,
представляющее собой массу тела в граммах, и выводящую на экран массу
этого тела в килограммах.
 */

import java.util.Scanner;

public class Exercies2_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" dzer qash@ gramnerov");

        double ves = scanner.nextDouble();
        System.out.println(" dzer qash@ kilogramnerov klini " + (ves / 1000) + " kg");

        scanner.close();
    }
}
