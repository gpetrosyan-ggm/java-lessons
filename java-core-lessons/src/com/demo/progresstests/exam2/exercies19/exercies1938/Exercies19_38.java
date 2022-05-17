package com.demo.progresstests.exam2.exercies19.exercies1938;
/*
Напишите метод, который принимает в качестве параметра массив
целых чисел и выводит на печать порядковые номера всех ячеек, содержащих максимальное значение.
 */

public class Exercies19_38 {
    void massive(int[] arr) {
        int num = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                num = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[num]) {
                System.out.println(i);
            }
        }
    }
}
