package com.demo.progresstests.exam1.exercies2;
/*
Напишите класс, который присваивает переменной х значение 6,
а затем выводит на экран: в первой строке - это значение,
во второй - квадрат этого значения, в третьей - куб этого значения.
 */

public class Exercies2_3 {
    public static void main(String[] args) {
        int x = 6;
        System.out.println("1-in " + x);
        System.out.println("2-rd " + (x * x));
        System.out.println("3-rd " + (x * x * x));
    }
}
