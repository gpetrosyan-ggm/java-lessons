package com.demo.progresstests.exam2.exercies17.exercies1726;
/*
Напишите класс, который принимает в качестве параметра целое положительное число К.
Метод выводит на экран все простые двузначные числа, разница между которыми равна К.
 */

public class Exercies17_26 {
    void simpleNumber(int k) {
        int count1 = 0;
        for (int i = 10; i < 100; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                int m = i + k;
                for (int l = 2; l < m; l++) {
                    if ((i + k) % l == 0) {
                        count1++;
                    }
                }
                if (count1 == 0) {
                    System.out.println(i + " " + m);

                }
            }
        }
    }
}
