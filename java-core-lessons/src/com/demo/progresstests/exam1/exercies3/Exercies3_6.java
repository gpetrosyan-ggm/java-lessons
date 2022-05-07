package com.demo.progresstests.exam1.exercies3;
/*
Напишите класс, который принимает с клавиатуры целое число и
выводит на экран (в одной строке) три следующих за ним целых числа так,
чтобы разница между каждым числом и следующим за ним составляла 3.
Например: для введенного с клавиатуры числа 6 надо вывести на экран числа 9, 12, 15.
 */

import java.util.Scanner;

public class Exercies3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" tiv ");

        int i = scanner.nextInt();
        System.out.println(" ardyunq@ kstacvi " + (i + 3) + " ; " + (i + 2 * 3) + " ; " + (i + 3 * 3));
    }
}
