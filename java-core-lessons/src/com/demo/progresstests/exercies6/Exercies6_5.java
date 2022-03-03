package com.demo.progresstests.exercies6;
/*
Напишите класс, который принимает с клавиатуры два целых числа и,
если первое больше второго, выводит на экран их сумму, если же наоборот - выводит на экран
их произведение. В случае же, если числа одинаковы, программа выводит на экран
сообщение Числа равны.
 */

import java.util.Scanner;

public class Exercies6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("amboxjakan tiv ");
        int a = scanner.nextInt();
        System.out.println("eli amboxjakan tiv ");

        int b = scanner.nextInt();
        if (a > b){
            System.out.println( a + b);
        }
        if (a == b){
            System.out.println("tver@ havasar en");
        }
        if (a < b){
            System.out.println(a * b);
        }
        scanner.close();

    }
}
