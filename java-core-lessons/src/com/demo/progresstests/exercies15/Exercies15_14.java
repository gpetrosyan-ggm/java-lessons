package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положительное число
и выводит на экран количество его цифр и их сумму.
 */

import java.util.Scanner;

public class Exercies15_14 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();
        while (true) {
            count++;
            sum += num % 10;
            num /=  10;

            if (num==0) {
                break;
            }
        }
        System.out.println("count = " + count + "; sum = " + sum);
        scanner.close();
    }
}
