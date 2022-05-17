package com.demo.progresstests.exam2.exercies19.exercies1930;
/*
Напишите метод, который принимает в качестве параметра массив и
проверяет, являются ли его элементы упорядоченными по возрастанию.
 */

public class Exercies19_30 {
    void massive(int[] arr) {
        boolean total = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                total = false;
                break;
            }
        }
        System.out.println(total);

    }
}
