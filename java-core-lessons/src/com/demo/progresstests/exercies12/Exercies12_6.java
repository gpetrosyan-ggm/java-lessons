package com.demo.progresstests.exercies12;
/*
Напишите класс, который принимает с клавиатуры целое число и проверяет,
на какое количество двузначных чисел оно делится.
Результат проверки класс должен вывести на экран вместе с соответствующим текстовым сообщением.
 */

import java.util.Scanner;

public class Exercies12_6 {
    public static void main(String[] args) {
        int c = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();
        for (int i = 10; i <= a; i++) {
            if (a % i == 0 && i < 100) {
                c++;
            }

        }
        System.out.println(c);

    }
}
