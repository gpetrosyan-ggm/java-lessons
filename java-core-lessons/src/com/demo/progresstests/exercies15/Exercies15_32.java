package com.demo.progresstests.exercies15;
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
            long num = scanner.nextLong(); // Sensey chishta int-ov texavorvum er, bayc partadir petqa zuyg tvov skseir
            long num1 = num;
            int count = 0;
            int count1 = 0;

            while (true) {
                if (num1 == 0) {
                    break;
                }
                boolean b = (num1 % 2 == 0) && (num1 % 10 != 0);

                if (b) {
                    count++;
                }
                num1 /= 10;
                count1++;
            }
            if (count >= 5) {
                for (int i = count1; i > 0; i--) {

                    boolean a = (num % 2 == 0) && (i % 2 != 0) && (num % 10 != 0);

                    if (a) {
                        countBig++;
                    }
                    num /= 10;
                }

            }
            if (countBig >= 5) {
                break;

            }
        }
        System.out.println(countBig + " bingo");
        scanner.close();
    }
}
