package com.demo.progresstests.exam1.exercies2;
/*
Напишите класс, который принимает с клавиатуры два целых числа,
первое из которых представляет собой год рождения, а второе - нынешний (текущий) год.
Класс должен вывести на экран возраст (в целых годах).
 */

import java.util.Scanner;

public class Exercies2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" vor tvakanin eq cnvel ");

        int i = scanner.nextInt();
        System.out.println(" hima vor tvakann e ");

        int j = scanner.nextInt();
        System.out.println(" Duq " + (j - i) + " tarekan eq");

        scanner.close();
    }
}
