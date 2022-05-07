package com.demo.progresstests.exam1.exercies15;
/*
Напишите класс, который должен принять с клавиатуры значение 123 и вывести на экран
сообщение Код принят.
Класс будет снова и снова принимать с клавиатуры значения до тех пор,
пока не будет введено значение 123. На каждое вводимое с клавиатуры значение,
отличное от 123, класс должен выводить сообщение Код неверный, повторите ввод.
 */

import java.util.Scanner;

public class Exercies15_7 {
    public static void main(String[] args) {
        int code = 123;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter code ...");
            int codeTmp = scanner.nextInt();
            if (codeTmp == code) {
                System.out.println("FINISH");
                break;
            }
            System.out.println("gaxnabar@ chshmarit che, krknrl");
        }
        scanner.close();
    }
}
