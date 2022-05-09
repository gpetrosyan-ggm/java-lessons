package com.demo.progresstests.exam2.exercies17.exercies1730;
/*
Напишите метод, который принимает в качестве параметра два целых положительных числа
(N и М, можно исходить из предположения, что M>N).
Метод возвращает, имеющее самое большое число делителей, число из диапазона N... М.
 */

public class Exercies17_30 {
    protected int bigDivisors(int n, int m) {
        int count = 0;
        int k = 1;
        for (int i = n; i <= m; i++) {
            int count1 = 0;
            for (int j = 2; j < n; j++) {
                if (i % j == 0) {
                    count1++;
                }
            }
            if (count1 > count) {
                count = count1;
                k = i;
            }
        }
        System.out.println(k);
        return  count;

    }
}
