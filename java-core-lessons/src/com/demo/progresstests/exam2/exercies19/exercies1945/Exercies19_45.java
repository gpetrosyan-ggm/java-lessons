package com.demo.progresstests.exam2.exercies19.exercies1945;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел
и сдвигает все элементы массива, кроме последнего, на
одну позицию вправо. Значение, находившееся в последней ячейке массива,
переходит в первую ячейку (правый сдвиг).
 */

public class Exercies19_45 {
    int[] massive(int[] arr) {
        int[] shift = new int[arr.length];
        int arr1 = arr.length - 1;
        for (int i = 0; i < arr1; i++) {
            shift[i + 1] = arr[i];
        }
        shift[0] = arr[arr.length - 1];
        return shift;
    }
}
