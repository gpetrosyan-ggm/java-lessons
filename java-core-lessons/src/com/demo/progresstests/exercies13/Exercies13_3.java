package com.demo.progresstests.exercies13;
/*
Напишите класс, который принимает с клавиатуры положительное целое число
и выводит на экран все его делители.
Кроме того, класс должен определять количество и сумму делителей и выводить результаты на экран.
 */

import java.util.Scanner;

public class Exercies13_3 {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                c = c + i;
                b++;
                System.out.print(i + " ");

            }

        }
        System.out.println();
        System.out.println(a + " tvi uni " + b + " baranarar ev dranc gumar@ " + c);
        scanner.close();
    }

}
