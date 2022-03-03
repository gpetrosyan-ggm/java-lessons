package com.demo.progresstests.exercies6;
/*
Напишите класс, который принимает с клавиатуры два значения:
первое - числитель дроби, второе - ее знаменатель.
Класс должен определить, является ли эта дробь «законной» (существующей),
и вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies6_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grel tiv - hamarich");

        int a = scanner.nextInt();
        System.out.println("isk hima haytarar, vor@ 0 chi kara lini ");

        int b = scanner.nextInt();
        if (a < b) {
            System.out.println("дробь «законной»");
        }
    }
}
