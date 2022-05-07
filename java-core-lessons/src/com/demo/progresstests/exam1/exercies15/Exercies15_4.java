package com.demo.progresstests.exam1.exercies15;
/*
Напишите класс, который принимает с клавиатуры числа, пока не будет введено значение О.
Для каждого введенного с клавиатуры положительного числа класс должен выводить на экран текст Плюс,
для каждого отрицательного - текст Минус.
 */

import java.util.Scanner;

public class Exercies15_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("tiv");
            int a = scanner.nextInt();

            if (a == 0) {
                System.out.println("finish");
                break;
            }
            if (a > 0) {
                System.out.println(" Плюс ");
            } else {
                System.out.println(" Минус");
            }
        }

        scanner.close();
    }
}
