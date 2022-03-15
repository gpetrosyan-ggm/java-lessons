package com.demo.progresstests.exercies13;
/*
Назовем «стабильным» положительное двузначное число, которое при умножении на 2 дает такое
двузначное число, в котором сумма цифр равна сумме цифр в двузначном числе до умножения.
Напишите класс, который выводит на экран все «стабильные» числа,
а также их количество и сумму этих чисел.
 */

public class Exercies13_17 {
    public static void main(String[] args) {
        int c = 0;
        int k =0;
        for (int i = 10; i < 100; i++) {  // stex kent tver@ bacarel em, vor animast ham hashvar chani, hamel if-um avel kod chgrem i%2==0

            int i10 = i / 10;
            int i1 = i % 10;
            int ii = i10 + i1;

            int a = i * 2;
            int a100 = a/100;
            int a10 = a / 10;
            int a1 = a % 10;
            int aa = a100 + a10 + a1;

            if (ii == aa) {
                k = k +i;
                c++;
                System.out.println("erknish tiv@ " + i + " gumar@ " + ii);
            }
        }
        System.out.println("qanak@ " + c);
        System.out.println("ayd tveri gumar@ " + k);
    }
}
