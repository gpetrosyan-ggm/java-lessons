package com.demo.progresstests.exercies9;
/*
На каждом этаже многоэтажного дома расположены три квартиры;
счет квартир идет слева направо. Например, на первом этаже квартира №1 расположена слева,
квартира №2 - в центре, квартира №3 - справа, и так далее.
Напишите класс, который принимает с клавиатуры номер квартиры и
выводит на экран следующую информацию: на каком этаже она расположена,
и какое место (слева, справа или в центре) она занимает на этом этаже.
 */

import java.util.Scanner;

public class Exercies9_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("number build");
        int numberBuild = scanner.nextInt();

        int floor = (numberBuild + 2) / 3;
        //int left;
        //int centre;
        //int right;
        if (numberBuild % 3 == 1) {
            System.out.println("floor = " + floor + " left ");
        } else if (numberBuild % 3 == 2) {
            System.out.println("floor = " + floor + " center ");
        } else {
            System.out.println("floor = " + floor + " right");
        }
        scanner.close();
    }
}



