package com.demo.progresstests.exercies15;
/*
Наибольший общий делитель (НОД) двух целых положительных чисел можно определить
по алгоритму Евклида: НОД чисел а, Ь равен НОД меньшего из чисел и остатка от деления
большего числа на меньшее.
Напишите класс, который принимает с клавиатуры два целых положительных числа
и определяет их НОД описанным методом.
 */
//Sensey Ekvilidi banadzevov em sax shshel
//https://scienceland.info/algebra8/euclid-algorithm
import java.util.Scanner;

public class Exercies15_44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number a");
        int a = scanner.nextInt();

        System.out.println("number b");
        int b = scanner.nextInt();
        int max;
        int min;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        while (min != 0) {
            if (max % min != 0) {
                int c = max % min;
                max = min;
                min = c;
                System.out.println(max + "  " + min);
            } else {
                break;
            }

        }
    }
}
