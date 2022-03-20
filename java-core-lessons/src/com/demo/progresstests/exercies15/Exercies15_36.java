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

        while (true){
            if (num<=0){
                break;
            }
            for (int i = 1; i < num;i++){
                if (num==i*i){
                    System.out.println(i+"-n handisanum e" );
                }
            }

        }
    }
}
