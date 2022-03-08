package com.demo.progresstests.exercies11;
/*
Напишите класс, который принимает с клавиатуры целое число и выводит на экран
10 предшествующих ему чисел, причем разница между значениями этих чисел должна быть равна 6.
 */

import java.util.Scanner;

public class Exercies11_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        for (int i = (a - 6); i > (a - 66); i -= 6) {
            System.out.println(i);
        }
    }
}
