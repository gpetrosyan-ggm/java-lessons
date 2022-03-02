package com.demo.progresstests.exercies4;
/*
Напишите класс, который принимает с клавиатуры целое положительное двузначное число.
Затем следует построить новое значение, составленное из цифр числа, введенного с клавиатуры,
но в обратном порядке. После этого новое значение следует увеличить на 8,
и окончательный результат вывести на экран.
То есть для числа 37 следует построить число 73 и вывести на экран 81.
 */

import java.util.Scanner;

public class Exercies4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("erknish drakan tiv - ");

        int a = scanner.nextInt();
        System.out.println(a / 10 + a % 10 * 10 + 8);

        scanner.close();
    }
}
