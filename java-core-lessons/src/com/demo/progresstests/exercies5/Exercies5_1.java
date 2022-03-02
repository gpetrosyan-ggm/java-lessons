package com.demo.progresstests.exercies5;
/*
Переменные, используемые в задании, инициированы следующим об­
разом:
int а=О, Ь=-3, с=9;
Заполните таблицы (в столбце Значение выражения следует написать false или true):

Лоrическое выражение        |       Значение выражения
(a + b) * 3 == -9           |
Ь * а == с * (-а)           |
с / Ь == Ь * (-1)           |
(-Ь) * (-Ь) >= с            |
Ь / (-с) == 1 / Ь           |
80 >= 80                    |
Ь * Ь != а * с              |
Ь < а                       |
Ь * Ь == с                  |
-с / Ь == -Ь                |
 */

public class Exercies5_1 {
    public static void main(String[] args) {
        int a = 0;
        int b = -3;
        int c = 9;
        double k = b / (-c);
        double m = 1 / c;
        if ((a + b) * 3 == -9) {
            System.out.println("(a+b) * 3 ==-9  true");
        } else {
            System.out.println("(a+b) * 3 ==-9  false");
        }
        if (a * b == c * (-a)) {
            System.out.println("a * b == c * (-a)  true");
        } else {
            System.out.println("a * b == c * (-a)  false");
        }
        if (c / b == b * (-1)) {
            System.out.println("c / b == b * (-1)  true");
        } else {
            System.out.println("c / b == b * (-1)  false");
        }
        if ((-b) * (-b) >= c) {
            System.out.println("(-b) * (-b) >= c  true");
        } else {
            System.out.println("(-b) * (-b) >= c  false");
        }
        if (b / (-c) == 1 / b) {
            System.out.println("b / (-c) == 1/b  true"); // patasxan@ irakanum false e, bayc qani vor mer popoxakaner@
        } else {
            System.out.println("b / (-c) == 1/b  false");//int en, -3/(-9)=0; 1/(-3)=0; 0 = 0 tpum e true
        }
        if (80 >= 80) {
            System.out.println("80 >= 80  true");
        } else {
            System.out.println("80 >= 80  false");
        }
        if (b * b != a * c) {
            System.out.println("b * b != a * c  true");
        } else {
            System.out.println("b * b != a * c  false");
        }
        if (b < a) {
            System.out.println("b < a  true");
        } else {
            System.out.println("b < a  false");
        }
        if (b * b == c) {
            System.out.println("b * b == c  true");
        } else {
            System.out.println("b * b == c  false");
        }
        if ((-c) / b == (-b)) {
            System.out.println("(-c) / b == (-b)  true");
        } else {
            System.out.println("(-c) / b == (-b)  false");
        }
    }
}
