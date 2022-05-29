package com.demo.progresstests.exam2.exercies19.exercies1943;
/*
Напишите метод, который получает в качестве параметров два упорядоченных по возрастанию массива
и возвращает упорядоченный по возрастанию массив, содержащий значения обоих массивов-параметров,
но без повторов значений.
Например, если массивы-параметры содержат 1, 3, 5, 7 и 2, 5, 7, 9, 11, т
о выходной массив содержит значения 1, 2, 3, 5, 7, 9, 11.
 */

public class Exercies19_43 {
    int[] massive(int[] arr1, int[] arr2) {
        int uniqueLength = uniqueLength(arr1, arr2);

        int a1 = 0;
        int a2 = 0;
        int[] uniqueArr = new int[uniqueLength];
        for (int i = 0; i < uniqueArr.length; i++) {
            if (arr1.length > a1 && arr2.length > a2) {
                if (arr1[a1] == arr2[a2]) {
                    uniqueArr[i] = arr1[a1];
                    a1++;
                    a2++;
                } else if (arr1[a1] > arr2[a2]) {
                    uniqueArr[i] = arr2[a2++];
                } else {
                    uniqueArr[i] = arr1[a1++];
                }
            } else if (arr1.length <= a1) {
                uniqueArr[i] = arr2[a2++];
            } else {
                uniqueArr[i] = arr1[a1++];
            }
        }

        return uniqueArr;
    }

    private int uniqueLength(int[] arr1, int[] arr2) {
        int length = 0;
        for (int k : arr1) {
            for (int i : arr2) {
                if (k == i) {
                    length++;
                }
            }
        }
        return arr1.length + arr2.length - length;
    }

}
