package com.demo.progresstests.exercies4;
/*
Назовем «сдвигом числа вправо по кругу» операцию, при которой все цифры числа сдвигаются вправо,
а число единиц (последняя цифра) перемещается в старший разряд числа (первая цифра).
Например, из числа 1234 получается число 4123.
Напишите класс, который принимает с клавиатуры трехзначное число
и строит новое число, полученное «сдвигом вправо по кругу».
 */

import java.util.Scanner;

public class Exercies4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tper eranish drakan tiv ..");

        int a = scanner.nextInt();
        int a234 = a / 10;
        int a4 = a % 10;
        System.out.println(a234 + a4 * 100);

        scanner.close();
    }
}
