package com.demo.progresstests.exercies12;
/*
Напишите класс, который генерирует 15 целых чисел в интервале от -25 до 25,
печатает их, а затем выводит на экран информацию о том, сколько из них были:
• положительными;
• четными;
• однозначными.
 */

public class Exercies12_5 {
    public static void main(String[] args) {
        int b = 0;
        int c = 0;
        int d = 0;
        int min = -25;
        int max = 25;
        for (int i = 0; i < 15; i++) {
            int a = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(a + " ");
            if (a > 0) {
                b++;
            }
            if (a % 2 == 0) {
                c++;
            }
            if (-10 < a && a < 10) {
                d++;
            }
        }
        System.out.println("drakan " + b + " zuyg " + c + " mianish " + d);
    }
}
