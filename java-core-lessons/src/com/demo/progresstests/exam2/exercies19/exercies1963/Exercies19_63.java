package com.demo.progresstests.exam2.exercies19.exercies1963;
/*
Напишите метод, который принимает два параметра: массив целых
чисел и целое число К, указывающее на одну из ячеек массива (номер ячейки).
Метод возвращает сумму значений, содержащихся в массиве от начала массива до ячейки К
(не включая значение в ячейке номер К).
 */

public class Exercies19_63 {
    int massive(int[] arr, int k) {
        int sum = 0;
        if (k < arr.length) {
            for (int i = 0; i < k; i++) {
                sum += arr[i];
            }

        }
        return sum;
    }
}
