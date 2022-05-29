package com.demo.progresstests.exam2.exercies19.exercies1949;
/*
Напишите метод, который принимает в качестве параметров два массива целых чисел и проверяет,
является ли первый массив подмассивом второго.
 */

public class Exercies19_49 {
    void massive(int[] arr1, int[] arr2) {

        if (arr2.length < arr1.length) {
            System.out.println("arajin massivi erkarutyun@ mec e erkrorfinic");
            return;
        }

        boolean verity = false;
        int idx = 0;
        while (arr2.length - idx >= arr1.length) {
            if (verity) {
                break;
            }
            verity = isNested(idx, arr1, arr2);
            idx++;
        }

        System.out.println("Entamas " + (verity ? "e" : "che"));
    }

    private boolean isNested(int idx, int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i + idx] != arr1[i]) {
                return false;
            }
        }
        return true;
    }

}
