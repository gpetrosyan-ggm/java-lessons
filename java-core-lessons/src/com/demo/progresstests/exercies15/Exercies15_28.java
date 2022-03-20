package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое число и подсчитывает число цифр в нем
(количество цифр в числе). Результат подсчета должен быть выведен на экран.
Например, для числа 534 на экран будет выведено 3 цифры.
 */

import java.util.Scanner;

public class Exercies15_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();
        int count = 0;

        while (num!=0) {

            if (num % 10 == 0) {
                num /= 10;
                continue;
            }
            num /= 10;
            count++;
        }
        System.out.println(count);
        scanner.close();
    }
}
