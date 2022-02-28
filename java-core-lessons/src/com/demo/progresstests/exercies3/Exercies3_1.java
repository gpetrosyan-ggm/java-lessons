package com.demo.progresstests.exercies3;
/*
Связь между температурой по шкале Цельсия и температурой по шкале Фаренгейта выражается формулой:
C=S(F-32)/9, где С - температура по шкале Цельсия, F - температура по шкале Фаренгейта.
Напишите класс, который принимает с клавиатуры температуру по шкале Фаренгейта,
а затем выводит на экран эту же температуру, но по шкале Цельсия.
 */

// C = (F - 32) : 1,8

import java.util.Scanner;

public class Exercies3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("jermastichan@ @st farehayti..");

        int F = scanner.nextInt();
        System.out.println("jermastichan@ @st celsusi C = " + (F - 32) / 1.8);

      scanner.close();
    }
}
