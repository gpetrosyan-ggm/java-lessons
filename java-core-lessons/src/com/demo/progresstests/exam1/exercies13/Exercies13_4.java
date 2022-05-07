package com.demo.progresstests.exam1.exercies13;
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
        if (a > 0) {

            for (int i = 1; i < a; i++) {

                    b = b + i;
                    System.out.println(i);
            }
        } else {
            System.out.println("dzer @ntrac tiv@ drakan che");
        }
        System.out.println(b);

    }
}
