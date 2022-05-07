package com.demo.progresstests.exam1.exercies8;
/*
Напишите класс, который принимает с клавиатуры два числа:
первое - количество учеников в классе,
второе - количество стульев в классной комнате.
Программа проверит соответствие между этими двумя значениями и
выведет на экран соответствующую информацию
(например, для значений 35 и 39 на экран выводится 4 стула лишних).
 */

import java.util.Scanner;

public class Exercies8_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ashakertneri qanak ");

        int a = scanner.nextInt();
        System.out.println("atorneri qanak");

        int b = scanner.nextInt();
        if (b >= a) {
            System.out.println("avel atorneri qanak@ " + (b - a));
        } else {
            System.out.println("atorner@ pakas en " + (a - b));
        }
        scanner.close();
    }
}
