package com.demo.progresstests.exam1.exercies8;
/*
Напишите класс, который принимает с клавиатуры трехзначное число
и изменяет его следующим образом:
    • для четных чисел - все четные цифры увеличиваются на 1, а нечетные уменьшаются на 1;
      в случае если это невозможно, они остаются неизменными;
    • в нечетных числах все изменения производятся «наоборот».
Программа должна вывести на экран новое значение переменной.
 */

import java.util.Scanner;

public class Exercies8_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eranish tiv");

        int a = scanner.nextInt();
        int a100;
        int a10;
        int a1;
        a100 = a / 100;
        a10 = a / 10 % 10;
        a1 = a % 10;
        if (a % 2 == 0) {
            if (a100 % 2 == 0) {
                a100 = a100 + 1;
            } else {
                a100 = a100 - 1;
            }
            if (a10 % 2 == 0) {
                a10 = a10 + 1;
            } else {
                a10 = a10 - 1;
            }
            if (a1 % 2 == 0) {
                a1 = a1 + 1;
            } else {
                a1 = a1 - 1;
            }
            System.out.println((a100 * 100 + a10 * 10 + a1));
        } else {
            if (a100 % 2 == 1) {
                a100 = a100 + 1;
            } else {
                a100 = a100 - 1;
            }
            if (a10 % 2 == 1) {
                a10 = a10 + 1;
            } else {
                a10 = a10 - 1;
            }
            if (a1 % 2 == 1) {
                a1 = a1 + 1;
            } else {
                a1 = a1 - 1;
            }
            System.out.println((a100 * 100 + a10 * 10 + a1));
        }
        scanner.close();
    }

}
