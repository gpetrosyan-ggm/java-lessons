package com.demo.progresstests.exam2.exercies19.exercies1923;
/*
Напишите метод, который принимает два параметра: массив целых чисел М и еще одно целое число Х.
Метод проверяет, находится ли число Х в массиве.
 */
//Sensey stex foreachov grevi error el talis; xi?

public class Exercies19_23 {
    void massive(int[] arr, int x) {
        boolean ret = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ret = true;
                break;
            }

        }

        System.out.println(ret);
    }

    void massive1(int[] arr, int x) {
        boolean ret = false;
        for (int a : arr) {
            if (a == x) {
                ret = true;
                break;
            }
        }
        System.out.println(ret);
    }

}
