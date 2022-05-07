package com.demo.progresstests.exam1.exercies7;
/*
Дана команда:
    if (а%3==Ь%4) System.out.println(a-b);
    else System.out.println(Ь-a);

Заполните таблицу в соответствии с исполнением этой команды:

-----------------------------------------------------------------
|a              |   2   |   4   |   9   |   4   |   3   |   6   |
-----------------------------------------------------------------
|b              |   6   |   4   |   2   |   9   |   3   |   0   |
-----------------------------------------------------------------
|if (а%3==Ь%4)  | true  | false | false | true  | false | true  |
-----------------------------------------------------------------
|На экран       |  -4   |   0   |   -7  |  -5   |   0   |    6  |
-----------------------------------------------------------------
 */

public class Exercies7_2 {
    public static void main(String[] args) {
        orinak(6, 0);
    }
        private static void orinak(int a, int b){

            if (a % 3 == b % 4) {
                System.out.println("1 " + (a - b));
            } else {
                System.out.println("2 " + (b - a));

        }
    }
}
