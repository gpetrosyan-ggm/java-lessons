package com.demo.progresstests.exam1.exercies12;
/*
Два положительных целых числа называются «родственными», если у них есть
одинаковое количество делителей.
Напишите класс, который принимает с клавиатуры два целых положительных числа и проверяет,
являются ли они «родственными».
 */

import java.util.Scanner;

public class Exercies12_17 {
    public static void main(String[] args) {
        int c = 0;
        int d = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("drakan tiv");
        int a = scanner.nextInt();

        System.out.println("eli drakan");
        int b = scanner.nextInt();
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                c++;
            }
        }
        for (int i = 2; i < b; i++) {
            if (b % i == 0) {
                d++;
            }
        }
        if (c == d) {
            System.out.println("barekamner en");
        } else {
            System.out.println("ancanotner");
        }
    }
}
