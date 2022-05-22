package com.demo.progresstests.exam2.exercies19.exercies1958;

/*
Напишите метод, который получает в качестве параметров два массива
(не обязательно одинакового размера; состоящие из неповторяющихся элементов) целых чисел.
Метод возвращает количество общих для обоих массивов значений {т.е.
таких значений, которые присутствуют в первом и втором массивах).
 */
public class Exercies19_58 {
    int[] massive(int[] arr1, int[] arr2) {
        int count = 0;
        boolean v = true;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        }
        int[] present = new int[arr1.length + arr2.length - count];
        int a = 0;
        for (int i = 0; i < present.length + count; i++) {
            if (i < arr1.length) {
                present[i] = arr1[i];
            } else {
                for (int j = 0; j < arr2.length; j++) {
                    for (int k = 0; k < arr1.length; k++) {
                        if (arr2[j] == arr1[k]) {
                            v = false;

                        }
                    }
                    if (v == true) {
                        present[arr1.length + a] = arr2[j];
                        a++;
                    }
                }
            }


        }
        return present;
    }
}
