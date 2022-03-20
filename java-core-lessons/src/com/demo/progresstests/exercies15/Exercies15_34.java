package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положительное число х.
Класс должен определить наибольшее значение в серии 1*1 + 2*2 + 3*3 + ..,
сумма которой не превышает х.
 */
//wile - ov chem el karum patkeracnem vonc lucem
import java.util.Scanner;

public class Exercies15_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();
        int c = 0;
        int a = 0;

        for (int i = 1; i < num; i++) {
            c += i * i;

            if (num < c) {
                System.out.println((c - i * i) + " " + i);
                break;
            }
        }
        scanner.close();
    }
}
