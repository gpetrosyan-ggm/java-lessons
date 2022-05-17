package com.demo.progresstests.exam2.exercies19.exercies1933;

/*
Напишите метод, который принимает в качестве параметра массив
целых чисел и возвращает сумму его элементов.
 */
// Sensey vor foreach-ov em grum, sum-i pah@ vonc anem error chqci
public class Exercies19_33 {
    int massive(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
