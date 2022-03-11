package com.demo.progresstests.exercies11;
/*
Напишите класс, который принимает с клавиатуры целое число и выводит
на экран 18 последующих ему чисел.
 */

import java.util.Scanner;

public class Exercies11_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("amboxj tiv");
        int a = scanner.nextInt();

        int b = a + 19;
        int c = a+1;
        for (int i = c; i < b; i++) {
            System.out.println(i);
        }
    }
}
