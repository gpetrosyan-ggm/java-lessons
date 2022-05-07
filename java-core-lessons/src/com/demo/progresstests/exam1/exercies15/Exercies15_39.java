package com.demo.progresstests.exam1.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положительное число
и находит его наименьший делитель, отличный от 1.
 */

import java.util.Scanner;

public class Exercies15_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();
        int divider = 2;
        while (true) {

            if (num % divider == 0) {
                System.out.println(divider);
                break;
            }
            divider++;
        }
        scanner.close();
    }
}
