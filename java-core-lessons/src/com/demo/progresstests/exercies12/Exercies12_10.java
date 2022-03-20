package com.demo.progresstests.exercies12;
/*
Контрольная работа считается «провальной», если более половины учеников
получили неудовлетворительные оценки.
Напишите класс, который принимает с клавиатуры число учеников в группе,
а затем - оценку каждого ученика.
Класс должен определить, была ли контрольная «провальной».
 */

import java.util.Scanner;

public class Exercies12_10 {
    public static void main(String[] args) {
        int c = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("ashakertneri qanak@ ");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.println("ashakertneri gnahatakan 1-ic minjev 5 ");
            int b = scanner.nextInt();
            if (b <= 2) {
                c++;
            }
        }
        if (c > a / 2) {
            System.out.println("praval");
        } else {
            System.out.println("barehajox e");
        }
    }
}
