package com.demo.progresstests.exam2.exercies19.exercies1964;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел А
и возвращает массив В, каждый элемент B[k] которого равен сумме значений,
содержащихся в массиве А от начала массива до ячейки k включительно (массив частичных сумм).
 */

public class Exercies19_64 {
    int[] massive(int[] arr) {
        int sum = 0;
        int[] massiveSum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            massiveSum[i] = sum;
        }
        return massiveSum;
    }
}
