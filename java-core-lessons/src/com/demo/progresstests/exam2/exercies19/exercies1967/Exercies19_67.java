package com.demo.progresstests.exam2.exercies19.exercies1967;
/*
Напишите метод, который принимает в качестве параметра массив четного размера,
пары ячеек которого (первая и вторая, третья и четвертая, пятая и шестая ... и так далее)
содержат координаты (Х и У) точек.
Массив должен вернуть номер точки наиболее удаленной от начала координат.
 */

public class Exercies19_67 {
    int massive(int[] arr) {
        double distance = 0;
        int a = 1;
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length; i += 2) {
                double distance1 = Math.sqrt(arr[i] * arr[i] + arr[i + 1] * arr[i + 1]);
                if (distance1 > distance) {
                    distance = distance1;
                    a++;
                }
            }

        } else {
            // error
        }
        return a;
    }
}
