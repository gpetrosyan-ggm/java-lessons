package com.demo.progresstests.exam2.exercies19.exercies1928;
/*
Напишите метод, который принимает в качестве параметра массив
целых чисел Ми целое число К (номер одной из ячеек массива).
Метод возвращает сумму значений, расположенных в ячейках массива
от ячейки номер К - до конца массива.
 */

public class Exercies19_28 {
    int massive(int[] arr, int k) {
        int sum = 0;
        if (k >= arr.length) {
            System.out.print(k + " mec e masivi erkarutyunic sum = " );
        } else {

            for (int i = k; i < arr.length; i++) {
                sum += arr[i];
            }
        }

        return sum;
    }
}
