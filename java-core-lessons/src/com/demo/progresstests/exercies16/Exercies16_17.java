package com.demo.progresstests.exercies16;
/*
Напишите класс, который принимает с клавиатуры целое положительное число
и выводит на экран все его делители, которые являются простыми числами.
 */

import java.util.Scanner;

public class Exercies16_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("numbver");
        int num = scanner.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {

                for (int j = 2; j < i; j++) {
                    int x = 0;

                    for (int k = 2; k < j; k++) {
                        if (j % k != 0) {
                            x++;
                        }
                    }
                    if (x == 0) {
                        System.out.println(i);
                    }
                }
            }
        }

    }
}
