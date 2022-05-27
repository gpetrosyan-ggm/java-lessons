package com.demo.progresstests.exam2.exercies19.exercies1935;
/*
Напишите метод, который принимает в качестве параметра массив и
возвращает:
• значение true, если количество ячеек со значениями,
  меньшими среднего арифметического всего массива,
  равно количеству ячеек со значениями большими среднего арифметического всего массива;
• значение false в ином случае.
 */

public class Exercies19_35 {
    boolean massive(int[] arr) {
        int sum = 0;
        int count1 = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double middle = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != middle) {
                count = arr[i] > middle ? count1++ : count1--;
            }
        }

        if (count == 0) {
            return true;
        }
        return false;
    }
}
