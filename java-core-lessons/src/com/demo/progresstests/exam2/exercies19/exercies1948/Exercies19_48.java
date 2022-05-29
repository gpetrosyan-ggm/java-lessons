package com.demo.progresstests.exam2.exercies19.exercies1948;
/*
Напишите метод, который принимает в качестве параметров два массива целых чисел и проверяет,
содержатся ли все значения первого массива во втором.
 */

public class Exercies19_48 {
    void massive(int[] arr1, int[] arr2) {

        int count = 0;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        count++;
                        break;
                    }

                }

            }
            System.out.println(count == arr1.length);

        } else {
            System.out.println("massivneri erkarutyunner@ chen hamapatasxanum paymanin");
        }
    }
}
