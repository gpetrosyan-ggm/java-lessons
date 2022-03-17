package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целые числа, пока не будут введены с клавиатуры
друг за другом два одинаковых числа.
Класс должен выводить на экран сумму серии - за исключением последнего
введенного с клавиатуры значения.
 */

import java.util.Scanner;

public class Exercies15_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num1 = scanner.nextInt();
        int sum = num1;

        while (true) {
            System.out.println("number");
            int num = scanner.nextInt();
            if (num1 == num) {
                break;
            }
            sum += num;
            num1 = num;
        }
        System.out.println(sum);
        scanner.close();
    }
}
