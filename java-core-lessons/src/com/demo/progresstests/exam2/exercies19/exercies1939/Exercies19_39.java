package com.demo.progresstests.exam2.exercies19.exercies1939;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел и «переворачивает» его.
Например, если в качестве параметра получен массив 1, 3, 6, 2, 7,
после окончания работы метода содержимое массива будет 7, 2, 6, 3, 1.
 */
//19-16

import java.util.Arrays;

public class Exercies19_39 {
void massive(int[] arr){

    int n = arr.length;
    int over;

    for (int i = 0; i < n/2; i++) {
        over = arr[n-i-1];
        arr[n-i-1] = arr[i];
        arr[i] = over;
    }

    System.out.println(Arrays.toString(arr));
}

}
