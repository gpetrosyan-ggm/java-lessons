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
        int min;
        int max;

        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }

        for (int i = min; i < max; i++) {
            System.out.println(i + " ");
        }
    }

}
