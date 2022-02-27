package com.demo.progresstests.exercies2;
/*
Напишите класс, который принимает с клавиатуры целое число и выводит на экран число,
которое больше введенного с клавиатуры на 10.
 */

import java.util.Scanner;

public class Exercies2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" greq dzer tiv@ ");

        int i = scanner.nextInt();
        System.out.println(+(i + 10));
        scanner.close();
    }

}
