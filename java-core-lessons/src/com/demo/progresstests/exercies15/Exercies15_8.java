package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры значения, пока их сумма остается меньше 150.
По окончании ввода следует вывести на экран информацию о количестве введенных значений и их сумме
 */

import java.util.Scanner;

public class Exercies15_8 {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        int quantity = 0;
        Scanner scanner = new Scanner(System.in);

        while (sum < 150) {
            System.out.println("tiv");
            int a = scanner.nextInt();
            if (sum1 < 150) {
                sum += a;
                quantity++;
                sum1 = sum + a;
            }
            break;
        }
        System.out.println("sum = " + sum + " quantity = " + quantity);
        scanner.close();
    }
}
