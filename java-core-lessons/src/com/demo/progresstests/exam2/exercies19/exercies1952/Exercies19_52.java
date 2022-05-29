package com.demo.progresstests.exam2.exercies19.exercies1952;
/*
Напишите метод, который принимает в качестве параметров два массива целых чисел.
Метод возвращает массив, содержащий значения массивов-параметров, записанные по правилу
«сначала одно значение из первого, потом все значения из второго,
потом второе значение из первого, потом снова все значения из второго... ».
Например, для массивов 1, 2, 3, 4 и 6, 7, 8, 9 метод возвращает массив
1, 6, 7, 8, 9, 2, 6, 7, 8, 9, 3, 6, 7, 8, 9, 4, 6, 7, 8, 9.
 */

public class Exercies19_52 {
    int[] massive(int[] arr1, int[] arr2) {
        int lenght = arr2.length + 1;
        int[] mass = new int[arr1.length * lenght];

        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            mass[k++] = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                mass[k++] = arr2[j];
            }
        }
        return mass;
    }

}
