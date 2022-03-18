package com.demo.progresstests.exercies15;
/*
Напишите класс, который должен принимать с клавиатуры серию возрастающих по значению целых чисел.
Класс должен выводить на экран количество значений в серии - за исключением последнего
введенного с клавиатуры значения.
 */

import java.util.Scanner;

public class Exercies15_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = Integer.MIN_VALUE;
        while (true) {

            System.out.println("number");
            int num = scanner.nextInt();

            if (num2 < num) {
                num1 += num;
                num2 = num;
            } else {
                break;
            }
            System.out.println(num1);
        }
        System.out.println(num1 + " FINISH");
        scanner.close();
    }
}

