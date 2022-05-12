package com.demo.progresstests.exam2.exercies19.exercies1922;
/*
Напишите метод, который принимает два параметра: массив целых чисел М и еще одно целое число Х.
Метод возвращает количество ячеек массива М, содержащих значение Х (число появлений Х в М).
 */

public class Exercies19_22 {

    int massive(int[] arr, int x) {
        int count = 0;
        for (int i : arr) {
            if (checkExists(i, x)) {
                count++;
            }
        }
        return count;
    }

    private boolean checkExists(int a, int x) {
        if (a < x) {
            return false;
        }

        if (a == x) {
            return true;
        }

        int xTmp = x;
        int xLength = 1;
        while (xTmp > 9) {
            xLength++;
            xTmp /= 10;
        }
        int xPow = (int) Math.pow(10, xLength);

        while (a >= x) {
            if (a % xPow == x) {
                return true;
            }
            a /= 10;
        }

        return false;
    }

}
