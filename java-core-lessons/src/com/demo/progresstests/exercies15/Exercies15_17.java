package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положитель N и цифру D.
Класс должен проверить, есть ли внутри N цифра D, и вывести на экран соответствующее сообщение.
 */

import java.util.Scanner;

public class Exercies15_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 1;
        System.out.println("number");
        int num = scanner.nextInt();

        System.out.println("number 1");
        int num1 = scanner.nextInt();
        int num2 = num1;
        while (num2 != 0) {

            c *= 10;
            num2 /= 10;
        }
        while (num > 0) {
            if (num % c == num1) {
                System.out.println("bingo");
                break;
            }
            num /= 10;
            if (num == 0) {
                System.out.println("chka ");
                break;
            }
        }
        scanner.close();
    }
}
