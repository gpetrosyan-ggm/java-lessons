package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры серию целых чисел до тех пор,
пока количество четных чисел в серии остается меньше 5.
 */

import java.util.Scanner;

public class Exercies15_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("number");
            int num = scanner.nextInt();
            int continium = 0;

            while (num > 0) {
                if (num % 10 != 0 && num % 2 == 0) {
                    continium++;
                }
                num /= 10;
            }
            if (continium >= 5) {
                System.out.println("zuyg tveri qanak@ " + continium);
                break;
            }
        }
        scanner.close();
    }
}
