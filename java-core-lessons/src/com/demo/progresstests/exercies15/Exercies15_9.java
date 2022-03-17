package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое число, а затем выводит на экран
последующие ему целые числа, пока сумма этих чисел не превышает квадрата введенного числа.
 */

import java.util.Scanner;

public class Exercies15_9 {
    public static void main(String[] args) {
        int b = 0;
        int k = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();
        int c = a * a;

        while (true) {

            if (k < c) {
                System.out.print(" " + a);
                b = b + a++;
                k = b + a;
            } else {
                break;
            }
        }
        System.out.println();
        System.out.println(b);
        scanner.close();
    }
}
