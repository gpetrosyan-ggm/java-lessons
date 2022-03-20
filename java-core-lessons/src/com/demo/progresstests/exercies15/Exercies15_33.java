package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое число (для переменной х)
и выводит на экран серию значений: х, х*x, х*x*x, •••  до тех пор,
пока очередное значение остается меньше 1000
 */
//Sensey esi vonc vor Araya

import java.util.Scanner;

public class Exercies15_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int x = scanner.nextInt();
        int num = x;

        while (true) {

            System.out.println(num);
            if (num > 1000) {
                num /= x;
                break;
            }
            num *= x;
        }
        System.out.println(num);
        scanner.close();
    }
}
