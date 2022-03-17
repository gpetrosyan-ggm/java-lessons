package com.demo.progresstests.exercies15;
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
        Scanner scanner = new Scanner(System.in);

        System.out.println("tpel 123 tiv@");
        int a = scanner.nextInt();
        System.out.println("kodn @ndunvac e");

        while (a == 123) {
            System.out.println("code");
            int b = scanner.nextInt();

            if (b == a) {
                System.out.println("FINISH");
                break;
            } else {
                System.out.println("gaxnabar@ chshmarit che, krknrl");
            }

        }
        scanner.close();
    }
}
