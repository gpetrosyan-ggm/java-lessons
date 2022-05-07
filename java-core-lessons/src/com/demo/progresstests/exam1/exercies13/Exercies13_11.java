package com.demo.progresstests.exam1.exercies13;
/*
Напишите класс, который принимает с клавиатуры оценки 30 учеников класса и выводит на экран:
• среднюю арифметическую оценку класса;
• число учеников, получивших неудовлетворительные оценки.
 */
// neka hamakargov chgitem 10 balanocum anbavara@ vorna, grum em 5 balanocov

import java.util.Scanner;

public class Exercies13_11 {
    public static void main(String[] args) {
        int b = 0;
        int c = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 30; i++) {
            System.out.println("ashakerti gnahatakan <=5");
            int a = scanner.nextInt();
            b = b + a;
            if (a <= 2) {
                c++;

            }
        }
        double d = (double) b / 30;  // double em sarqel vor aveli stuyg stanam mijin gnahatakan@
        System.out.println("ashakertneri mijin gnahatakan@ " + d);
        System.out.println("anbavarar ashakartneri qanak@ " + c);
    }
}
