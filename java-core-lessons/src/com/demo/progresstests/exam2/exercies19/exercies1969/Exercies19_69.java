package com.demo.progresstests.exam2.exercies19.exercies1969;
/*
Напишите метод, который принимает два параметра:
• положительное число R, которое равно радиусу окружности с центром в начале координат;
• массив четного размера, пары ячеек которого (первая и вторая, третья и четвертая,
  пятая и шестая ... и так далее) содержат координаты (Х и У) точек.
Метод должен определить точки, лежащие на окружности радиуса R с центром в начале координат,
и вернуть массив этих точек.
 */

public class Exercies19_69 {
    int[] massive(int[] arr, int r) {

        int count = 0;
        double distance;
        int a = 0;
        for (int i = 0; i < arr.length; i += 2) {
            distance = Math.sqrt(arr[i] * arr[i] + arr[i + 1] * arr[i + 1]);
            if (r >= distance) {
                count++;
            }
        }
        int[] cordinat = new int[count * 2];
        for (int i = 0; i < arr.length; i += 2) {
            distance = Math.sqrt(arr[i] * arr[i] + arr[i + 1] * arr[i + 1]);
            if (r >= distance) {
                cordinat[a] = arr[i];
                cordinat[a + 1] = arr[i + 1];
                a += 2;
            }
        }
        return cordinat;
    }
}
