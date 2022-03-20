package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое число и выводит на экран:
• в первой строке - все четные (по значению) цифры этого числа, через пробел;
• во второй строке - все нечетные (по значению) цифры этого числа, через пробел.
Например, для числа 765873 в первой строке будет выведена серия 6 8, а во второй строке - 7 5 7 3.
 */

// Sensey esi en momentna vor asecir hishacnem, todos chanes

import java.util.Scanner;

public class Exercies15_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();
        int num1 = num;

        while (true) {

            if (num1 % 2 == 0 && num1 % 10 != 0) {
                System.out.print(num1 % 10 + " ");
            }
            num1 /= 10;
            if (num1 == 0) {
                break;
            }
        }
        System.out.println();
        while (true) {
            if (num % 2 != 0) {
                System.out.print(num % 10 + " ");
            }
            num /= 10;
            if (num == 0) {
                break;
            }
        }
        scanner.close();
    }
}
