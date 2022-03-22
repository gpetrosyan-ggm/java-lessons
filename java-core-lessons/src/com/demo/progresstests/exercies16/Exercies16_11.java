package com.demo.progresstests.exercies16;
/*
Напишите класс, который находит натуральное число от 1 до 10000 с максимальной суммой делителей.
 */

public class Exercies16_11 {
    public static void main(String[] args) {
        int count1 = 0;
        int k = 0;

        for (int i = 1; i <= 1000; i++) {
            int count = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count > count1) {
                count1 = count;
                k = i;
            }
        }
        System.out.println(k);
    }
}
