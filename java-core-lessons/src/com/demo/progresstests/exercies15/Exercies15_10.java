package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры число для переменной Х,
а затем дополнительную серию чисел, каждое из которых используется для уменьшения значения
переменной Х. Ввод чисел должен производиться до тех пор,
пока значение переменной Х остается положительным.
 */

import java.util.Scanner;

public class Exercies15_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv");
        int a = scanner.nextInt();

        while (a>0){
            if (a<=1){
                break;
            }
            a-=2;
            System.out.println(a);
        }
        scanner.close();
    }
}
