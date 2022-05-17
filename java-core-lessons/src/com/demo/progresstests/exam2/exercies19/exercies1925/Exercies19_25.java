package com.demo.progresstests.exam2.exercies19.exercies1925;
/*
Напишите метод, который принимает в качестве параметра массив целых чисел М
и целое число Х и проверяет, встречается ли в массиве пара расположенных
в смежных ячейках чисел, сумма которых равна Х.
 */

public class Exercies19_25 {
    void massive(int[] arr, int x) {
        boolean total = false;
        for (int i = 1; i < arr.length; i++) {

                if ( (arr[i] + arr[i-1]) == x) {
                    total = true;
                    break;

            }
        }
        System.out.println(total);
    }

}
