package com.demo.progresstests.exercies8;
/*
Напишите класс, который принимает с клавиатуры целое положительное число
и изменяет его следующим образом:
    • для четного числа - увеличивает его до ближайшего «крутлого» и
      выводит новое значение на экран вместе с сообщением Up to."
    • для нечетного числа - уменьшает его до ближайшего «крутлого» и
      выводит новое значение на экран вместе с сообщением Down to".
Например, для введенного значения 433 на экран выводится Down to 430,
а для 56 выводится Up to 60.
 */

import java.util.Scanner;

public class Exercies8_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        int a = scanner.nextInt();
        int a1 = a % 10;
        if (a1 % 2 == 0) {
            System.out.println("Up to " + (a - a1 + 10));
        } else {
            System.out.println("Down to " + (a/10 * 10));
        }
        scanner.close();
    }
}
