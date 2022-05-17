package com.demo.progresstests.exam2.exercies19.exercies1931;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел М и целое число К
(номер одной из ячеек массива).
Метод проверяет, являются ли элементы массива в ячейках от начальной - до ячейки номер К
упорядоченными по убыванию, и возвращает соответствующее логическое значение.
 */
// es paragayum chgitrem ete k==0; @ndunem false te true, ete petqa @ndunvi false uremn if()-um kavelacnem
public class Exercies19_31 {
    boolean massive(int[] arr, int k) {

        if (k >= arr.length) { // || k==0;
            return false;
        } else {
            for (int i = 1; i < k; i++) {
                if (arr[i] >=arr[i - 1]){
                    return false;
                }
            }
        }
        return true;
    }
}
