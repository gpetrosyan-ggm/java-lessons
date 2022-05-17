package com.demo.progresstests.exam2.exercies19.exercies1921;
/*
Напишите метод, который получает в качестве параметра массив и заполняет его
случайными двузначными числами так, чтобы значения элементов в массиве не повторялись.
 */
// miguce xndir@ sxal em haskacel, bayc grel em nenc vor drakan u bacasakan mievnuyn tiv@ chkrknvi

import java.util.Arrays;

public class Exercies19_21 {
    void massive(int[] arr) {
        int min = -99;
        int max = 99;
        int val = 0;
        int v = Math.abs(val);
        for (int i = 0; i < arr.length; i++) {
            val = randomVal(max, min, v);
            arr[i] = val;

        }
        System.out.println(Arrays.toString(arr));
    }

    private int randomVal(int max, int min, int v) {
        int random = (int) (Math.random() * (max - min + 1) + min);
        int r = Math.abs(random);
        while (random < 9 && random > -9 || r == v) {
            random = (int) (Math.random() * (max - min + 1) + min);
        }
        return random;
    }
}
