package com.demo.progresstests.exercies2;
/*
2.10
Напишите класс, который принимает с клавиатуры целое число
и выводит на экран следующие значения (каждое в отдельной строке): снова введенное число
и число, противоположное введенному числу.
 */

import java.util.Scanner;

public class Exercies2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" greq dzer tiv@ ");

        int a = scanner.nextInt();
        System.out.println(+a);
        System.out.println(+(-a));
        scanner.close();
    }
}
