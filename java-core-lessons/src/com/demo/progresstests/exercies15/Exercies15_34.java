package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положительное число х.
Класс должен определить наибольшее значение в серии 1*1 + 2*2 + 3*3 + ..,
сумма которой не превышает х.
 */
//esi du es grel

import java.util.Scanner;

public class Exercies15_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int x = scanner.nextInt();
        int sum = 0;
        int i = 1;

        while (true) {
            System.out.println(sum);
            if (sum > x) {
                i--;
                sum -= i * i;
                break;
            }
            sum += i * i;
            i++;
        }

        System.out.println(i + " - " + sum);
        scanner.close();
    }

}
