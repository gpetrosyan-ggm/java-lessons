package com.demo.progresstests.exam1.exercies7;
/*
Напишите класс, который принимает с клавиатуры два числа,
первое из которых - количество учеников в классе,
а второе - количество столов в классной комнате.
Программа должна проверить, всем ли ученикам будет, где сесть.
Предполагается, что за столом могут сидеть два ученика.
 */

import java.util.Scanner;

public class Exercies7_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ashakertneri tiv@  ");

        int a = scanner.nextInt();
        System.out.println("sexanneri qanak ");

        int b = scanner.nextInt();
        if (a * 2 <= b) {
            System.out.println("ashakertner@ khajaxen dproc");
        } else {
            System.out.println("ancanq heravar das@ntaci");
        }
        scanner.close();
    }
}
