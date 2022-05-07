package com.demo.progresstests.exam1.exercies2;
/*
2.12
Напишите класс, который принимает с клавиатуры два целых числа,
каждое из которых представляет собой размер одной из сторон прямоугольника
и выводит на экран следующие значения (каждое в отдельной строке):
площадь прямоугольника и его периметр.
 */

import java.util.Scanner;

public class Exercies2_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" greq dzer tiv@ ");

        int a = scanner.nextInt();
        System.out.println("xndrem evs mek tiv");

        int b = scanner.nextInt();
        System.out.println("uxankyan makeres@ klini " + (a * b));
        System.out.println("uxxankyan paragic@ klini" + (2 * a + 2 * b));
        scanner.close();
    }
}
