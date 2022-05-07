package com.demo.progresstests.exam1.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положительное число
и находит его наибольший делитель, отличный от самого числа.
 */

import java.util.Scanner;

public class Exercies15_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();

        int divider = num - 1;

        while (true) {
            if (divider != 0 && num % divider == 0) {
                System.out.println(divider);
                break;
            }
            divider--;
        }
        scanner.close();
    }
}
