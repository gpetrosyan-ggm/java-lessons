package com.demo.progresstests.exam1.exercies15;
/*
При внесении в компьютерную программу оценок группы из 30 учеников учитель может
допустить ошибку (ввести число, не являющееся оценкой).
Компьютерная программа игнорирует ошибку, а учитель получает возможность
вновь занести с клавиатуры оценку.
Напишите класс, который принимает с клавиатуры оценки 30 учеников до тех пор,
пока все ученики не получат оценки.
Класс должен подсчитать среднюю арифметическую оценку группы,
а также количество ошибок, допущенных при введении оценок.
 */

import java.util.Scanner;

public class Exercies15_49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int student = 0;
        double medium = 0;
        int overalScore = 0;
        int error = 0;

        while (student < 30) {
            System.out.println("grade");
            int grade = scanner.nextInt();

            if (grade > 0 && grade < 11) {
                student++;
                medium++;
                overalScore += grade;
            } else {
                error++;
            }


        }
        System.out.println(overalScore / medium + " mijin gnahatakan");
        System.out.println(error + " error");
    }
}
