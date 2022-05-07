package com.demo.progresstests.exam1.exercies15;
/*
Напишите класс, который принимает с клавиатуры значения, пока их сумма остается меньше 150.
По окончании ввода следует вывести на экран информацию о количестве введенных значений и их сумме
 */

import java.util.Scanner;

public class Exercies15_8 {
    public static void main(String[] args) {
        int sum = 0;
        int quantity = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("tiv");
            int a = scanner.nextInt();
            int sumTmp = sum + a;
            if (sumTmp > 150) {
                break;
            }
            sum = sumTmp;
            quantity++;
        }
        System.out.println("sum = " + sum + " quantity = " + quantity);
        scanner.close();
    }
}
