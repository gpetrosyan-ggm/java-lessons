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

        int a1 = 0;
        int a2 = 0;
        int lenght = arr2.length + 1;
        int[] mass = new int[arr1.length * lenght];


        for (int i = 0; i < mass.length; i++) {
            if (i % lenght != 0) {
                mass[i] = arr2[a2];
                a2++;
                if (a2 == arr2.length) {
                    a2 = 0;

                }
            }else {
                mass[i] = arr1[a1];
                a1++;
            }
        }
        return mass;

    }
}
