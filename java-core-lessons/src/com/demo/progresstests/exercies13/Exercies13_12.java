package com.demo.progresstests.exercies13;
/*
Напишите класс, который принимает с клавиатуры оценки 30 учеников класса и выводит на экран:
• среднюю арифметическую оценку учеников, получивших удовлетворительные оценки;
• среднюю арифметическую оценку учеников, получивших неудовлетворительные оценки.
Что произойдет при исполнении программы, если все 30 учеников получили удовлетворительные оценки?
 */
// voch mi ban el chi katarvi, uxaki cuylikneri hamar grvac kod@ chi katarvi

import java.util.Scanner;

public class Exercies13_12 {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        int d = 0;
        int f = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 30; i++) {
            System.out.println("gnahatakan 5 balanocum");
            int a = scanner.nextInt();
            if (a >= 3) {
                c++;
                b = b + a;

            } else {
                d++;
                f = f + a;
            }
        }
        if (c != 0) {
            double mijinGer = (double) b / c;
            System.out.println("sovoroxneri mijin gnahatak@ " + mijinGer);
        } else {
            System.out.println("ay qez dasaran, debilneri havaqacu");
        }

        if (d != 0) {
            double mijinCuyl = (double) f / d;
            System.out.println("cuylikneri mijin gnahatak@ " + mijinCuyl);
        } else {
            System.out.println("esli lriv dodikneri havaqacuya, ANBAVARAR CHKA");
        }


    }
}
