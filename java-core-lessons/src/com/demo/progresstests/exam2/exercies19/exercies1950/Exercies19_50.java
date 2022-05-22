package com.demo.progresstests.exam2.exercies19.exercies1950;
/*
Напишите метод, который принимает в качестве параметров два массива целых чисел одинаковой длины.
Метод определяет, сколько пар «параллельных» (с одинаковыми номерами) ячеек в этих массивах
содержат одинаковые значения, и возвращает это количество.
Например, для массивов 4, 6, 7, 2, 5, 3 и 5, 6, 2, 2, 4, 3 метод возвращает значение 3.
 */

public class Exercies19_50 {
    int massive(int[] arr1, int[] arr2) {
        int count = 0;

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    count++;
                }
            }
        } else {
            System.out.println("anhamapatasxanutyun");
        }
        return count;
    }
}
