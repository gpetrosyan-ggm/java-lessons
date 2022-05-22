package com.demo.progresstests.exam2.exercies19.exercies1956;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел А
и возвращает новый массив В, состоящий только из четных элементов массива А.
 */

public class Exercies19_56 {
    int[] massive(int[] arr) {
        int lengt = 0;
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                lengt++;
            }
        }

        int[] even = new int[lengt];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[a] = arr[i];
                a++;
            }
        }
        return even;
    }
}
