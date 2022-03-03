package com.demo.progresstests.exercies6;
/*
Напишите класс, который принимает с клавиатуры два значения:
первое - числитель дроби, второе - ее знаменатель (можно исходить из
предположения, что второе значение отлично от нуля).
Класс должен определить, является ли эта дробь положительной или
отрицательной, и вывести на экран соответствующее текстовое сообщение.
 */

import java.util.Scanner;

public class Exercies6_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("grel tiv - hamarich");

        int a = scanner.nextInt();
        System.out.println("isk hima haytarar, vor@ 0 chi kara lini ");

        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("chi дробь «отрицательной»");
        }
        if (a < b) {
            System.out.println("дробь «положительной»");
        }
    }
}
