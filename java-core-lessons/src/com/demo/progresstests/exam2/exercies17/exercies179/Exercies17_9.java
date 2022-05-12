package com.demo.progresstests.exam2.exercies17.exercies179;

/*
Напишите метод, который получает в качестве параметра два числа (А и В)
и выводит на экран все четные числа из диапазона А ... В.
 */
// chem dzum, qani vor chi asum, bayc ete petq lini kases kdzem
public class Exercies17_9 {
    public void evenНumbers(int a, int b) {

        int c = (b - a) / 2;
        int k = a % 2 != 0 ? a - 1 : a;
        for (int i = 0; i < c; i++) {
            k += 2;
            if (k < b) {
                System.out.print(k + ", ");
            }
        }
    }
}
