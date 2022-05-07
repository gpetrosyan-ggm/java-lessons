package com.demo.progresstests.exam1.exercies2;
/*
Напишите класс, который принимает с клавиатуры целое число
и затем выводит на экран его квадрат и его же куб, а между ними знак &.
 */

import java.util.Scanner;

public class Exercies2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" greq dzer tiv@ ");

        int a = scanner.nextInt();
        System.out.println((a * a) + " & " + (a * a * a));
        scanner.close();
    }
}
