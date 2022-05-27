package com.demo.progresstests.exam2.exercies19.exercies1936;
/*
Напишите метод, который принимает в качестве параметра массив
целых чисел и возвращает максимальное значение массива.
 */

public class Exercies19_36 {
    int masive(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length-1; i++) {
        if (arr[i]>max){
            max = arr[i];
        }
        }
        return max;
    }
}
