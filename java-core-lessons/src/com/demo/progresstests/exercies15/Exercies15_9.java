package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое число, а затем выводит на экран
последующие ему целые числа, пока сумма этих чисел не превышает квадрата введенного числа.
 */

import java.util.Scanner;

public class Exercies15_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int num = scanner.nextInt();
        int num3 = num * num;
        int sum = 0;

        while (sum < num3) {
            int tmpSum = sum + ++num;
            if (tmpSum > num3) {
                break;
            }
            sum = tmpSum;
            System.out.println(sum);
        }
        System.out.println(sum);
        scanner.close();
    }
}
