package com.demo.progresstests.exam2.exercies19.exercies1940;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел
и возвращает новый массив, который содержит те же значения, что и массив,
полученный в качестве параметра, но в обратном порядке.
Например, если в качестве параметра получен массив 1, 3, 6, 2, 7 - метод возвращает массив
7, 2, 6, 3, 1.
 */

public class Exercies19_40 {

    int[] massive(int[] arr) {
        int[] reversArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversArr[i] = arr[arr.length - i - 1];
        }
        return reversArr;
    }

}
