package com.demo.progresstests.exam2.exercies19.exercies1944;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел
и сдвигает все элементы массива, кроме первого, на одну позицию влево.
Значение, находившееся в начальной ячейке массива, переходит в последнюю ячейку (левый сдвиг).
 */

public class Exercies19_44 {
    int[] massive(int[] arr) {
        int[] shift = new int[arr.length];

        for (int i = 1; i < arr.length; i++) {
            shift[i - 1] = arr[i];
        }
        shift[arr.length - 1] = arr[0];
        return shift;
    }
}
