package com.demo.progresstests.exercies4;

import java.util.Scanner;

/*
Назовем «длиной трехзначного числа» разницу между его первой (число сотен)
и последней (число единиц) цифрами, умноженную на его среднюю (число десятков) цифру.
Напишите класс, который принимает с клавиатуры целое положительное трехзначное число,
вычисляет его «длину» и выводит результат на экран.
 */
public class Exercies4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eranish drakan tiv ");

        int a = scanner.nextInt();
        int a100 = a / 100;
        int a10 = a / 10 % 10;
        int a1 = a % 10;
        System.out.println((a100 - a10) * a1);

        scanner.close();

    }
}
