package com.demo.progresstests.exam2.exercies19.exercies1937;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел
и возвращает порядковый номер ячейки, содержащей максимальное значение.
Если в массиве есть несколько ячеек, содержащих максимальное значение,
метод вернет порядковый номер первой из них.

 */

public class Exercies19_37 {
    int massive(int[] arr) {
        int num = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                num = i;
            }
        }
        return num;
    }
}
