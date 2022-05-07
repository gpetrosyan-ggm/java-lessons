package com.demo.progresstests.exam1.exercies13;
/*
Напишите класс, который принимает с клавиатуры три целых числа и проверяет,
являются ли они тремя последовательными членами арифметической прогрессии.
В случае если являются, класс должен вывести на экран еще дующих членов этой же прогрессии;
в ином случае - соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies13_25 {

    public static void main(String[] args) {
        int max;
        int min;

        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        System.out.println("tiv");
        int b = scanner.nextInt();

        System.out.println("tiv");
        int c = scanner.nextInt();

        int progresia = c;

        if ((a - b) == (b - c)) {

            for (int i = 1; i < 5; i++) {
                progresia = progresia + b - a;
                System.out.println(" " + progresia);
            }
        }else {
            System.out.println("tvabanakan progresia che");
        }
        scanner.close();
    }
}
