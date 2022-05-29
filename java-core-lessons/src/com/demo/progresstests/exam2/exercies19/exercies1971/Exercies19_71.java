package com.demo.progresstests.exam2.exercies19.exercies1971;
/*
Напишите класс, который принимает с клавиатуры целое положительное число N,
создает массив размером N и заполняет его случайными числами вновь
и вновь до получения полноrо массива.
Класс должен вывести на экран окончательный массив и число итераций,
которые понадобились для получения полноrо массива.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercies19_71 {
    public static void main(String[] args) {
        int n = getN();
        int[] massive = new int[n];

        massive[0] = randomNumber(1, n);
        for (int i = 1; i < n; i++) {
            massive[i] = randomNumber(massive, 1, n);
        }
        System.out.println(Arrays.toString(massive));
    }

    private static int getN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number N");
        int n = scanner.nextInt();
        scanner.close();
        return Math.abs(n);
    }

    private static int randomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min + 1) + min));
    }

    private static int randomNumber(int[] arr, int min, int max) {
        int random = randomNumber(min, max);
        while (hasNumber(arr, random)) {
            random = randomNumber(min, max);
        }
        return random;
    }

    private static boolean hasNumber(int[] arr, int random) {
        for (int a : arr) {
            if (a == random) {
                return true;
            }
        }
        return false;
    }

}
