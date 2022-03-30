package com.demo.progresstests.exercies13;
/*
Для участия в финале конкурса участники двух предварительных этапов должны были набрать
не менее 80 баллов (на каждом предварительном этапе можно было получить максимум 50 баллов).
Напишите класс, который принимает с клавиатуры данные конкурса - 12 участников
в виде количества баллов, которые получил каждый участник на первом и втором предварительном этапе.
Для каждого участника класс должен определить, проходит ли он в финал,
или нет - и вывести на экран соответствующее сообщение
(вместе с общим количеством баллов, которое набрал участник).
 */

import java.util.Scanner;

public class Exercies13_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 13; i++) {
            System.out.println("arajin mrcuyti ardyunq@");
            int a = scanner.nextInt();

            System.out.println("erkrord mrcuyti ardyunq@");
            int b = scanner.nextInt();

            int c = a + b;
            if (c >= 80) {
                System.out.println(i + ". shnorhavor du ancel es ezrapakich havaqelov " + c + " miavor");
            } else {
                System.out.println(i + ". apsos mi poqr chheriqec du havaqecir " + c);
            }
        }
        scanner.close();
    }
}
