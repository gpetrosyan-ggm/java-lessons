package com.demo.progresstests.exam2.exercies19.exercies1953;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел А
и возвращает новый массив В, состоящий из элементов массива А, упорядоченных так,
чтобы все четные элементы массива А находились в начале массива В, а все нечетные - в его конце.
 */

public class Exercies19_53 {
    int[] massive(int[] arr) {
        int[] orderly = new int[arr.length];
        int count = 0;
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                orderly[a] = arr[i];
                count++;
                a++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                orderly[count] = arr[i];
                count++;
            }
        }
        return orderly;
    }
}
