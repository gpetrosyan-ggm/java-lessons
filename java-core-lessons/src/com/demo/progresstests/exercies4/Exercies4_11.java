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
        System.out.println(a / 10 + (a % (a / 10)) * 100);

        scanner.close();
    }
}
