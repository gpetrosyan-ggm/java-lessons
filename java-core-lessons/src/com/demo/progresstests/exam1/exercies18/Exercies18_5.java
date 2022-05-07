package com.demo.progresstests.exam1.exercies18;
/*
Укажите, какие значения будет содержать массив, после выполнения следующего блока
(случайные числа, генерируемые в блоке, выберите самостоятельно в соответствии
с указанными в команде границами, используйте таблицу трассировки):

for(int i = O; i < n; i = i + 2) {
    x = (int) (90 * Math.random() + 10);
    a[i] = x % 10;
    a[i+1] = x / 10;
}
 */

public class Exercies18_5 {
    // x = 54;
    // a[0] = 54 % 10 = 4;
    // a[1] = 54 / 10 = 5;

    // x = 73;
    // a[2] = 73 % 10 = 3;
    // a[3] = 73 / 10 = 7;

    // x = 62;
    // a[4] = 62 % 10 = 2;
    // a[5] = 62 / 10 = 6;
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i<5; i+=2){
            int x = (int)(90*Math.random()+10);
            a[i] = x%10;
            a[i+1] = x/10;
            System.out.println(a[i] + " ");

        }
    }
}
