package com.demo.progresstests.exercies9;
/*
Напишите класс, который принимает с клавиатуры временной интервал, выраженный в секундах,
и выводит на экран тот же интервал, но выраженный в часах, минутах и секундах.
Если промежуток времени превышает сутки, то надо не производить пересчет,
а просто вывести на экран текстовое сообщение Расчет не производится.
 */

import java.util.Scanner;

public class Exercies9_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("tiv drakan");
        int a = scanner.nextInt();

        //ropen = 60 varkyan
        //jam = 60*rope = 60 * 60  = 3600 varkyan
        //or = 24 * jam = 24 * 3600 = 86_400 varkyan

        int jam = a / 3600;
        int rope = (a - (jam * 3600)) / 60;
        int varkyan = a % 60;

        if (a > 0 && a < 86_400) {
            System.out.println(jam + " jam " + rope + " rope " + varkyan + " varkyan");

        }else {
            System.out.println("hashvark@ chi katarvum ");
        }
        scanner.close();
    }
}
