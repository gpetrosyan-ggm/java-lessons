package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры целое положительное число
и строит из него число с обратным порядком цифр.
Новое значение следует вывести на экран.
 */

import java.util.Scanner;

public class Exercies15_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number");
        int num = scanner.nextInt();
        int a = 1;
        int x = 1;
        int numTemp = 0;
        int count = 0;

        int num1 = num;
        while (num1 > 0) {
            count++;
            num1 /= 10;
            a *= 10;
        }
        for (int i = count; i > 0; i--) {

            a /= 10;
            int number = (num / a * x);
            x *= 10;
            num %= a;
            numTemp += number;

        }
        System.out.println(numTemp);
        scanner.close();
    }
}
