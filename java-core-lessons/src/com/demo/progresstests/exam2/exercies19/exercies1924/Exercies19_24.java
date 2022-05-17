package com.demo.progresstests.exam2.exercies19.exercies1924;
/*
Напишите метод, который принимает в качестве параметра массив
целых чисел и проверяет, являются ли все элементы массива положительными числами.
 */

public class Exercies19_24 {
    void massive(int[] arr){
        boolean total = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                total = false;
                break;
            }

        }
        System.out.println(total);
    }
}
