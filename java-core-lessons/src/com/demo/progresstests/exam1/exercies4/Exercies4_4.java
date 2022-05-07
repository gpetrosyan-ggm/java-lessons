package com.demo.progresstests.exam1.exercies4;
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
        int a10 = a / 10;
        int a1 = a % 10 * 10;
        System.out.println(a10 + a1 + 8);

        scanner.close();
    }
}
