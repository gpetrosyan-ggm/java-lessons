package com.demo.progresstests.exam2.exercies17.exercies1731;
/*
Напишите метод, который принимает в качестве параметра два целых положительных числа
(N и М, можно исходить из предположения, что M>N).
Метод возвращает, имеющее самую большую сумму делителей, число из диапазона N... M.
 */

public class Exercies17_31 {
    void sumDivisors(int n, int m) {
        int count = 0;
        int k = 0;
        for (int i = n; i <= m; i++) {
            int count1 = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count1 += j;
                }
            }
            if (count1 > count) {
                count = count1;
                k = i;
            }
        }
        System.out.println(k + " - " + count);
    }
}
