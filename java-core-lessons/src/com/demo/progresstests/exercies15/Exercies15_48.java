package com.demo.progresstests.exercies15;
/*
Напишите класс, который принимает с клавиатуры оценки, полученные группой учеников,
и определяет среднюю арифметическую оценку в группе.
Ввод данных завершается, когда очередное вводимое с клавиатуры значение не является оценкой.
 */

import java.util.Scanner;

public class Exercies15_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double medium =0;
        int overalScore = 0;

        while (true) {
            System.out.println("grade");
            int grade = scanner.nextInt();

            if (grade < 1 || grade > 10) {
                break;
            }
            overalScore += grade;
            medium++;
        }
        if (medium!=0){
            System.out.println(overalScore / medium );
        }

    }


}
