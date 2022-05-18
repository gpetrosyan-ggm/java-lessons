package com.demo.progresstests.exam2.exercies19.exercies1941;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел
и возвращает новый массив с переставленными первой и второй половинами.
Например, если в качестве параметра получен массив 1, 3, 6, 8, 2, 7 -
метод возвращает массив 8, 2, 7, 1, 3, 6.
 */

public class Exercies19_41 {
    int[] masive(int[] arr) {
        int[] reversArr = new int[arr.length];


        for (int i = 0; i < arr.length / 2; i++) {
            reversArr[arr.length - arr.length / 2 + i] = arr[i];
        }

        for (int i = (arr.length - (arr.length / 2)); i < arr.length; i++) {
            reversArr[i - arr.length / 2] = arr[i];
        }
        return reversArr;
    }
}
