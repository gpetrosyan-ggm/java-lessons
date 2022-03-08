package com.demo.progresstests.exercies12;
/*
Напишите класс, который принимает с клавиатуры целое положительное число и определяет,
является ли оно простым.
Класс должен вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies12_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grel tiv");
        int a = scanner.nextInt();
        boolean parze = true;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println(a + " - parz tiv chi, bajanvuma - " + i);
                parze = false;
                break;
            }
        }

        if (parze) {
            System.out.println(a + " - parz tiv e");
        }

    }
}
