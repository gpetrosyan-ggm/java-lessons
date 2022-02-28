package com.demo.progresstests.exercies2;
/*
Кинетическая энергия тела подсчитывается как половина произведения массы тела
на квадрат скорости тела. Напишите класс, который принимает с клавиатуры два числа,
первое из которых - масса тела, а второе - его скорость.
Класс должен подсчитать и вывести на экран значение кинетической энергии тела.
 */

import java.util.Scanner;

public class Exercies2_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" marmni zangvac@ ... ");
        int weight = scanner.nextInt();

        System.out.println("marmni aragutyun@ ...");
        int speed = scanner.nextInt();


        System.out.println(" kinetik energian klini " + (weight * speed * speed / 2));
        scanner.close();
    }
}
