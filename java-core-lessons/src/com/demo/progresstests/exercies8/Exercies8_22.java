package com.demo.progresstests.exercies8;
/*
Напишите класс, который принимает в качестве параметров два целых
положительных числа и выводит на экран с дополнительным сообщением то из них,
у которого наибольшая последняя цифра (число единиц).
Если такого числа нет, класс должен вывести на экран соответствующее сообщение.
 */

public class Exercies8_22 {
    public static void main(String[] args) {
        orinak(23, 12);
    }

    private static void orinak(int a, int b) {
        if (a % 10 > b % 10) {
            System.out.println("1-i verji tiv@ mec e 2-ic");
        } else if (b % 10 > a % 10) {
            System.out.println("2-i verji tiv@ mec e 1-ic");
        } else {
            System.out.println("havasar en");
        }

    }
}
