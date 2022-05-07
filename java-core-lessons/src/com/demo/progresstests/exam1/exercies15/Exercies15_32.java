package com.demo.progresstests.exam1.exercies15;
/*
Напишите класс, который принимает с клавиатуры серию целых чисел до тех пор,
пока количество четных чисел на нечетных местах в серии остается меньше 5.
 */

import java.util.Scanner;

public class Exercies15_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBig = 0;
        while (true) {
            System.out.println("number");
            long num = scanner.nextLong();
            long num1 = num;
            int count = 0;

            while (num1 > 0) {
                count++;
                num1 /= 10;
            }
            for (int i = count; i > 0; i--) {
                boolean b = (num % 10 != 0) && (num % 2 == 0) && (i % 2 != 0);
                if (b) {
                    countBig++;
                }
                num /= 10;
            }
            if (countBig >= 5) {
                break;
            }
        }
        System.out.println(countBig + " bingo");
        scanner.close();
    }
}
