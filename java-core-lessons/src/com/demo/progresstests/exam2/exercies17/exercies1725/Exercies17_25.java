package com.demo.progresstests.exam2.exercies17.exercies1725;
/*
Напишите метод, который принимает в качестве параметра целое положительное число N.
Метод возвращает количество простых чисел, находящихся в диапазоне 1... N.
 */

public class Exercies17_25 {
    int qualityПositiveНumbers(int n) {
        int coount = 0;
        for (int i = 2; i <= n; i++) {
            int coount1 = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    coount1++;
                }
            }
            if (coount1 == 0) {
                coount++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        return coount;
    }
}
