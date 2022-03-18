package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положительное число.
Класс должен заменить его на сумму его же цифр и продолжать эту замену до тех пор,
пока не получится однозначное число. Все получающиеся значения следует вывести на экран.
 */

import java.util.Scanner;

public class Exercies15_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        long num = scanner.nextLong();

        while (true) {
            int sum = 0;
            while (true) {

                sum += num % 10;
                num /= 10;
                if (num == 0) {
                    System.out.println(sum);
                    num = sum;
                    break;
                }
            }
            if (num < 10) {
                break;
            }
            scanner.close();
        }
    }
}