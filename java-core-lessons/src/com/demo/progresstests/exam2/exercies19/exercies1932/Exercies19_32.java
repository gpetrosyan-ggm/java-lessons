package com.demo.progresstests.exam2.exercies19.exercies1932;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел М
и два целых числа К и Т (номера ячеек массива).
Метод проверяет, являются ли элементы массива, расположенные в нем от ячейки
номер К - до ячейки номер Т, упорядоченными по убыванию,
и возвращает соответствующее логическое значение.
 */

public class Exercies19_32 {
    boolean masive(int[] arr, int k, int t){
        if (k>t){
            int a = k;
            int b = t;
            k = b;
            t = a;
        }
        if (k>=arr.length||t>=arr.length){
            return false; // chgiteyi vonc aneyi vor error qcer, dra hamar false tveci
        }else {
        for (int i = (k+1); i <=t; i++) {
            if (arr[i] >= arr[i - 1]) {
                return false;
            }
        }
        }
        return true;
    }
}
