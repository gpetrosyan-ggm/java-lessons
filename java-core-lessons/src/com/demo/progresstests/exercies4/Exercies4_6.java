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
        System.out.println((a / 100 - a % (a / 10)) * ((a - a / 100 * 100) / 10));

        scanner.close();

    }
}
