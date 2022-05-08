package com.demo.progresstests.exam2.exercies17.exercies179;
/*
Напишите метод, который получает в качестве параметра два числа (А и В)
и выводит на экран все четные числа из диапазона А ... В.
 */

public class Exercies17_9 {
    public void evenНumbers(int a, int b) {

        int c = (b - a) / 2;
        if (a % 2 != 0) {
            a -= 1;
        }
        for (int i = 0; i < c; i++) {
            a += 2;
            if (a < b) {
                System.out.print(a + ", ");
            }
        }
    }
}
