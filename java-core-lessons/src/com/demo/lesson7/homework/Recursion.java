package com.demo.lesson7.homework;
/*
4.1 Дано натуральное число N. Вычислите сумму его цифр.
        При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
        (N ֊ int type է)

    4.2 Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки,
        или слово NO в противном случае. Операцией возведения в степень пользоваться нельзя!
        (N ֊ double type է)
 */

public class Recursion {
    public static void main(String[] args) {
        System.out.println(recurs(776));
        System.out.println(recurs1(-32) == 1 ? "yes" : "no");
    }

    static int recurs(int n) {
        if (n < 10) {
            return n;
        }
        return recurs(n / 10) + n % 10;
    }
    static double recurs1(double n) {
        if (n == 1) {
            return 1;
        }
        if (n % 2 != 0) {
            return -1;
        }
        return recurs1(n / 2);


    }
}
