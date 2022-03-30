package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое число и выводит на экран все числа,
которые можно получить из введенного за счет «стирания последней цифры».
Например, для введенного числа 52435 будут выведены на экран 5243, 524, 52, 5, О.
 */

import java.util.Scanner;

public class Exercies15_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();

        while (true) {
            num /= 10;
            System.out.println(num);
            if (num == 0) {
                break;
            }
        }
        scanner.close();
    }
}
