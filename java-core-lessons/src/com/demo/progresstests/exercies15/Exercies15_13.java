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

        while (true) {

            System.out.println("number");
            int num = scanner.nextInt();

            num1 += num;
            int num2 = num1 - num;

            if (num2 == 0) {
            } else {
                System.out.println(num2);
            }
            scanner.close();
        }
    }
}
