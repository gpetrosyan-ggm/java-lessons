package com.demo.progresstests.exam1.exercies18;
/*
Перед вами фрагмент класса (а - массив целых чисел нечетной длины):

int[] b = new int[a.length];
int mid = a.length / 2;
b[mid] = a[mid];
for (int k= 1; k <= mid; k++) {
    b[mid + k] = a[mid - k];
    b[mid - k] = a[mid + k];
}

Дан следующий массив а:
        0       1       2       3       4      5       6
    ---------------------------------------------------------
    |   3   |   5   |   2   |   9   |   6   |   4   |   0   |
    ---------------------------------------------------------

Укажите, какие значения будет содержать массив b, после выполнения фрагмента программы.
Используйте таблицу трассировки, включающую следующие столбцы:
------------------------------------------------------------------------------------------------
|   b[6]   |   b[5]   |   b[4]       |   b[3]   |   b[2]   |   b[1]   |   b[0]   |   k   |   mid   | k <= mid |
------------------------------------------------------------------------------------------------
|    3     |    5     |     2        |   9      |    6     |     4    |    0     |   1    |   3     |  k<=3    |
*/

public class Exercies18_10 {
    //int[] b = new int[a.length];
    //int mid = a.length / 2;         int mid = 7/2 = 3;
    //b[mid] = a[mid];                b[3] = a [3] =  9;
    //for (int k= 1; k <= mid; k++) {
    //    b[mid + k] = a[mid - k];
    //    b[mid - k] = a[mid + k];
    //}


    //for (int k= 1; k <= 3; k++) {
    //    b[mid + k] = a[mid - k];
    //    b[mid - k] = a[mid + k];
    //}
            // k = 1;
    // b[3+1] = a[3-1]    b[4] = a[2] = 2;
    // b[3-1] = a[3+1]    b[2] = a[4] = 6;

           // k = 2;
    // b[3+2] = a[3-2]    b[5] = a[1] = 5;
    // b[3-2] = a[3+2]    b[1] = a[5] = 4;

          // k = 3;
    // b[3+3] = a[3-3]    b[6] = a[0] = 3;
    // b[3-3] = a[3+3]    b[0] = a[6] = 0;
}
