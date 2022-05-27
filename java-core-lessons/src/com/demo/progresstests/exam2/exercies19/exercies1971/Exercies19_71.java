package com.demo.progresstests.exam2.exercies19.exercies1971;
/*
Напишите класс, который принимает с клавиатуры целое положительное число N,
создает массив размером N и заполняет его случайными числами вновь
и вновь до получения полноrо массива.
Класс должен вывести на экран окончательный массив и число итераций,
которые понадобились для получения полноrо массива.
 */
// es xndir@ chem haskacel vonc petqa lucem

import java.util.Arrays;
import java.util.Scanner;

public class Exercies19_71 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("number N");
        int n = scanner.nextInt();

        int max = 99;
        int min = 0;
        int count = 0;


        int[] massive = new int[n];
        for (int i = 0; i < n; i++) {
            massive[i] = randomNumber(min, max);
            for (int j = 0; j < i; j++) {
                if (massive[i] <= massive[j]) {
                    massive[i] = randomNumber(min, max);
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }

    private static int randomNumber(int min, int max) {
        int random = (int) ((Math.random() * (max - min + 1) + min));
        return random;
    }

}
