package com.demo.progresstests.exam2.exercies19.exercies1947;
/*
Напишите метод, который принимает в качестве параметров два массива целых чисел
одинаковой длины и проверяет, являются ли массивы идентичными.
 */


public class Exercies19_47 {
    void massive(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("massivneri erkarutyunner@ chen hamapatasxanum paymanin");
            return;
        }

        boolean verity = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("не  идентичные массивы");
                verity = false;
                break;
            }
        }
        if (verity) {
            System.out.println("идентичные массивы");
        }
    }

}
