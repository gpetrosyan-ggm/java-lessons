package com.demo.progresstests.exercies7;
/*
Напишите класс, который принимает с клавиатуры целое число и определяет,
является оно положительным или нет, и выводит на экран одно из двух
соответствующих результатам проверки сообщений: Положительное число и Не положительное число.
 */

import java.util.Scanner;

public class Exercies7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("amboxjakan tiv ..");

        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("drakan");
        } else if (a < 0) {
            System.out.println("bacasakan");
        }
        scanner.close();
    }
}
