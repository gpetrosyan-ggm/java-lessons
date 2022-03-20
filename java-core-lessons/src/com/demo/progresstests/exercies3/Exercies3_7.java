package com.demo.progresstests.exercies3;
/*
Напишите класс, который принимает с клавиатуры два значения:
первое - длина основания равнобедренного треугольника,
второе - высоту этого треугольника.
Затем класс должен подсчитать и вывести на экран:
    • площадь этого треугольника;
    • периметр прямоугольника, сторонами которого являются основание
      и высота описанного в задаче треугольника.
 */

import java.util.Scanner;

public class Exercies3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("havasarakoxm erankyan koxm@ ...");

        int a = scanner.nextInt();
        System.out.println("erankyan bardzrutyun ..");

        int h = scanner.nextInt();
        System.out.println("erankyan makeres@ klini S = " + (a * h / 2));
        System.out.println("uxxankyun erankyan paragigic@ klini P1 = " + (a + h + a / 2));

        scanner.close();
    }
}

