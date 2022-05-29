package com.demo.progresstests.exam2.exercies19.exercies1937;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел
и возвращает порядковый номер ячейки, содержащей максимальное значение.
Если в массиве есть несколько ячеек, содержащих максимальное значение,
метод вернет порядковый номер первой из них.

 */

public class Exercies19_37 {
    int massive(int[] arr) {
        int max = getMax(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == max) {
                return i;
            }
        }

        return -1;
    }

    private int getMax(int[] arr) {
        int max = arr[0];
        for (int a : arr) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

}
