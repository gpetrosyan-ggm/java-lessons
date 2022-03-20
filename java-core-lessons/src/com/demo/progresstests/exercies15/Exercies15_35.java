package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положительное число
и строит из него число с обратным порядком цифр.
Новое значение следует вывести на экран.
 */

import java.util.Scanner;

public class Exercies15_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();

        int count = 0;
        if (num % 10 == 0) {
            num /= 10;
        }
        int num1 = num;
        while (num > 0) {
            count++;
            num /= 10;

        }
        for (int i = count; i > 0; i--) {
            System.out.print(num1 % 10);
            num1 /= 10;
        }
        scanner.close();
    }
}
