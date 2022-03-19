package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое число и выводит на экран:
• в первой строке - все четные (по месту) цифры этого числа, через пробел;
• во второй строке - все нечетные (по месту) цифры этого числа, через пробел.
Например, для числа 765873 в первой строке будет выведена серия 6 8 3, а во второй строке - 7 5 7.
 */
// Sensey esel en momentna
import java.util.Scanner;

public class Exercies15_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();
        int num1 = num;
        int num2 = num;
        int count = 0;

        while (true) {
            if (num1 != 0) {
                count++;
            }
            num1 /= 10;
            if (num1 == 0) {
                break;
            }
        }
        for (int i = count; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.print(num2 % 10 + "  ");
            }
            num2 = num2 / 10;
        }
        System.out.println();
        for (int i = count; i > 0; i--) {
            if (i % 2 != 0) {
                System.out.print(num % 10 + "  ");
            }
            num = num / 10;
        }
        scanner.close();
    }
}
