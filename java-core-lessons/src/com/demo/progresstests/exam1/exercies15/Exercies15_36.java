package com.demo.progresstests.exam1.exercies15;
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
        while (true) {

            if (num < i * i) {
                System.out.println(num + " chi handisan voreve tvi qarakusi");// ete teqstavoy soobshenin petq chi, payman@ kgreyi while-um
                break;
            }
            if (num == i * i) {
                System.out.println(num + "-n handisanum e " + i + "-i qarakusin");
                break;
            }
            i++;
        }
    }
}
