package com.demo.progresstests.exercies4;
/*
Назовем «большим обменом» операцию, при которой два числа «обмениваются» своими левыми цифрами.
1.  Напишите класс, который принимает с клавиатуры два трехзначных положительных числа
    и совершает над ними операцию «обмена».
2.  Возможно ли совершить операцию «большого обмена», если два числа имеют
    разное количество цифр? Обоснуйте свой ответ
 */

import java.util.Scanner;

public class Exercies4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("tpel eranish drakan tiv ...");

        int a = scanner.nextInt();
        System.out.println(" tpel eli drakan eranish tiv...");

        int b = scanner.nextInt();
        System.out.println((a % 100 + b / 100 * 100) + " - " + (b % 100 + a / 100 * 100));

        scanner.close();
    }
}
//ete ayo hnaravor e ete naxapes gites gites vor tiv@ qani nish uni, verevi orinakum ete a-n liner qaranish
// apa xndri mej a-n kbajaneyi 1000 u bazmapatkeyi 1000-ov u ayd erku tveri arajin tver@ texov kpoxvein
//  public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("tpel qaranish drakan tiv ...");
//
//        int a = scanner.nextInt();
//        System.out.println(" tpel drakan eranish tiv...");
//
//        int b = scanner.nextInt();
//        System.out.println((a - (a/1000)*1000 + (b / 100)*100) + "  " + ((b - (b/100)*100) + (a / 1000)*1000) );
//
//        scanner.close();
//    }