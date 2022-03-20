package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое число
и подсчитывает количество нулей в этом числе.
Результат подсчета надо вывести на экран.
 */

import java.util.Scanner;

public class Exercies15_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();
        int continu = 0;

        while (num!=0) {

            if (num % 10 == 0) {
                continu++;
            }
            num /= 10;
        }
        System.out.println(continu);
        scanner.close();
    }
}
