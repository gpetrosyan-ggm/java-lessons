package com.demo.progresstests.exam2.exercies19.exercies1962;
/*
Напишите метод, который принимает в качестве параметров два массива целых чисел;
размеры массивов одинаковы.
Метод определяет, сколько пар «параллельных» (с одинаковыми номерами) ячеек в этих массивах
содержат одинаковые значения, и возвращает новый массив, содержащий эти значения.
Например, для массивов 4, 6, 7, 2, 5, 3 и 5, 6, 2, 2, 4, 3 метод возвращает массив 6, 2, 3.
 */

public class Exercies19_62 {
    int[] massive(int[] arr1, int[] arr2) {
        int length = 0;
        int a = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                length++;
            }
        }
        int[] present = new int[length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                present[a] = arr1[i];
                a++;
            }
        }
        return present;
    }
}
