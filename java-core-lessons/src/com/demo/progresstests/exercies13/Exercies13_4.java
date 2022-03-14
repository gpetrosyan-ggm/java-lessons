package com.demo.progresstests.exercies13;
/*
Назовем «базой» положительного числа Х сумму всех положительных целых чисел, меньших Х.
Напишите класс, который принимает с клавиатуры положительное целое число Х
и подсчитывает его «базу».
 */

import java.util.Scanner;

public class Exercies13_4 {
    public static void main(String[] args) {
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        for (int i = 1; i < a; i++) {
            if (i % 2 == 0) {
                b = b + i;
                System.out.println(i);
            }
        }
        System.out.println(b);

    }
}
