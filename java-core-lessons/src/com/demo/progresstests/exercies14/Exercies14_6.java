package com.demo.progresstests.exercies14;
/*
Напишите класс, который принимает с клавиатуры серию из 27 целых чисел и сравнивает два значения:
среднее арифметическое максимума и минимума, и среднее арифметическое всех значений серии.
 */

import java.util.Scanner;

public class Exercies14_6 {
    public static void main(String[] args) {
        int sum=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println(" tiv ");
            int b = scanner.nextInt();
            sum+=  b;

            if (b > max) {
                max = b;
            }
            if (b < min) {
                min = b;
            }
        }
        double k = (max + min) / 2;
        double avg = sum / 3;

        if (avg > k) {
            System.out.println("bolor tveri mijin@ aveli mec e " + avg + " > " + k);
        } else if (avg < k) {
            System.out.println("amena meci u amena poqri mijnn aveli mec e " + avg + " < " + k);
        } else {
            System.out.println("havasar en " + avg + " = " + k);
        }
        System.out.println( max + " " + min);
    }
}
