package com.demo.progresstests.exam2.exercies19.exercies1946;

import java.util.Arrays;

/*
Напишите метод, который принимает в качестве параметра массив целых чисел
и дополнительное целое число К. Если К положительное, метод производит К правых сдвигов,
если К отрицательное, - метод производит К левых сдвигов.

 */
public class Exercies19_46 {
    void massive(int[] arr, int k) {
        int shiftCount = shiftCount(k, arr.length);

        int[] shift = new int[arr.length];
        if (k < 0) {
            shiftLeft(arr, shift, shiftCount);
        } else {
            shiftRight(arr, shift, shiftCount);
        }
        System.out.println(Arrays.toString(shift));
    }

    private void shiftRight(int[] arr, int[] shift, int shiftCount) {
        for (int i = 0; i < shift.length; i++) {
            if (shiftCount <= 0) {
                shiftCount = shift.length;
            }
            shift[i] = arr[shift.length - shiftCount];
            shiftCount--;
        }
    }

    private void shiftLeft(int[] arr, int[] shift, int shiftCount) {
        for (int i = 0; i < shift.length; i++) {
            if (shiftCount >= shift.length) {
                shiftCount = 0;
            }
            shift[i] = arr[shiftCount];
            shiftCount++;
        }
    }

    private int shiftCount(int k, int length) {
        k = Math.abs(k);
        if (k < length) {
            return k;
        }
        return k % length;
    }

}
