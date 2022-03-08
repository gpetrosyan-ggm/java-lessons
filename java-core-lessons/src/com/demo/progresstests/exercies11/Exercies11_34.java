package com.demo.progresstests.exercies11;
/*
Напишите класс, который принимает с клавиатуры два целых положительных числа:
N и М (неизвестно, какое из введенных чисел больше).
Класс должен вывести на экран все целые числа между наименьшим
и наибольшим значениями, введенными с клавиатуры.
 */

import java.util.Scanner;

public class Exercies11_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("drakan tiv");
        int a = scanner.nextInt();

        System.out.println("eli drakan");
        int b = scanner.nextInt();

        if (a > b) {
            for (int i = (b + 1); i < a; i++) {
                System.out.println(i + " ");
            }
        } else {
            for (int i = (a + 1); i < b; i++) {
                System.out.println(i + " ");
            }
        }
    }
}
