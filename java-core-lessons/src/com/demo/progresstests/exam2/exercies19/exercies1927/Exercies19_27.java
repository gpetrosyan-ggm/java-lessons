package com.demo.progresstests.exam2.exercies19.exercies1927;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел М
и целое число К (номер одной из ячеек массива).
Метод возвращает сумму значений, расположенных в ячейках массива
от начальной - до ячейки номер К.
 */

public class Exercies19_27 {
    int massive(int[] arr, int k) {
        int sum = 0;
        if (k > arr.length) {
            System.out.print("masivi erkarutyun@ karj e" + " ");
        } else {
            for (int i = 0; i < k; i++) {
                sum += arr[i];

            }
        }
        return sum;
    }
}
