package com.demo.progresstests.exercies8;
/*
Напишите класс, который принимает с клавиатуры два целых числа и
изменяет их следующим образом:
    • при разных значениях, большее число уменьшается на 1, меньшее - увеличивается на 1
    • при одинаковых значениях чисел оба увеличиваются на 1.
Программа должна вывести на экран новые значения переменных.
 */

import java.util.Scanner;

public class Exercies8_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("amboxjakan ayn el drakan");

        int a = scanner.nextInt();
        System.out.println("eli drakan ");

        int b = scanner.nextInt();
        if (a > b) {
            System.out.println((a - 1) + " a > b " + (b + 1));
        } else if (a < b) {
            System.out.println((a + 1) + " a < b " + (b - 1));
        } else {
            System.out.println((a + 1) + " a = b " + (b + 1));
        }
        scanner.close();
    }
}
