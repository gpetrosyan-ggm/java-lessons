package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое число и определяет,
является ли оно точным квадратом целого числа.
 */

import java.util.Scanner;

public class Exercies15_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();
        int i = 1;
        while (num < i * i) {

            if (num < i * i) {
                System.out.println(num + " chi handisan vore tvi qarakusi");// ete teqstavoy soobshenin petq chi, payman@ kgreyi while-um
                break;
            }
            if (num == i * i) {
                System.out.println(i + "-n handisanum e" + num + "qarakusin");
                break;
            }
            i++;
        }
    }
}
