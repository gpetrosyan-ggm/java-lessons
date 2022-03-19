package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положительное число
и выводит на экран его первую цифру.
Например, для числа 7659 на экран будет выведено 7.
 */

import java.util.Scanner;

public class Exercies15_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();

        while (true) {
            if (num < 10) {
                System.out.println(num);
                break;
            }
            num/=10;

            }
        scanner.close();
    }
}
