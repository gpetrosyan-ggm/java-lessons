package com.demo.progresstests.exercies2;
/*
2.9
Напишите класс, который принимает с клавиатуры целое число
и выводит на экран следующие три значения (все - в одной строке, разделенные пробелом): число,
меньше введенного с клавиатуры на 1, число, введенное с клавиатуры,
и число, больше введенного с клавиатуры на 1.
 */

import java.util.Scanner;

public class Exercies2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" greq dzer tiv@ ");

        int a = scanner.nextInt();
        System.out.println((a - 1) + " " + a + " " + (a + 1));
        scanner.close();
    }
}
