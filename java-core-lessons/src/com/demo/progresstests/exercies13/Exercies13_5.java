package com.demo.progresstests.exercies13;
/*
Определим как «удивительное» целое положительное число Х,
для которого выполняется следующее условие:
сумма всех целых положительных чисел, меньших Х и являющихся делителями Х, равно Х.
Например, число 28 является «удивительным», потому что 1 + 2 + 4 + 7 + 14 = 28.
Напишите класс, который принимает в качестве параметра целое положительное число, проверяет,
является ли оно «удивительным», и выводит на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies13_5 {
    public static void main(String[] args) {
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                b = b + i;
                System.out.print(i + " + ");

            }

        }
        System.out.print(" = " + b);
        System.out.println();
        if (a == b) {
            System.out.println("«удивительное»");
        } else {
            System.out.println("baradi tiva");
        }
        scanner.close();
    }
}
