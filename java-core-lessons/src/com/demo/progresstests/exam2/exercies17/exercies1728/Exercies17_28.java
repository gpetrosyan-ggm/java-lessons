package com.demo.progresstests.exam2.exercies17.exercies1728;
/*
Напишите метод, который принимает в качестве параметра целое положительное число n
и выводит на экран значения факториалов всех чисел меньших n.
 */

public class Exercies17_28 {

    void fact(int n) {
        for (int j = 1; j <= n; n--) {
            int m = 1;
            for (int i = 1; i <= n; i++) {
                m = m * i;
            }
            System.out.println(m);
        }
    }
}