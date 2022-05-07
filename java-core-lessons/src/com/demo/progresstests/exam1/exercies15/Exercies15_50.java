package com.demo.progresstests.exam1.exercies15;
/*
Банк готов предоставить клиенту право производить операции на банковском счете при условии, //es 2 tox@ chem haskanum
что банковский овердрафт («минус>>, отрицательная сумма на счету) не превысит определенной суммы.//
Напишите класс, который принимает с клавиатуры два значения:
первое - величина допустимого овердрафта,
второе - сумма на счету клиента в данный момент.
Затем класс должен принять с клавиатуры серию чисел, каждое из которых - размер операции в рублях,
которую клиент выполняет на своем банковском счете.
Положительное значение - клиент вносит деньги на счет,
отрицательное значение - клиент снимает деньги со счета.
Ввод данных завершается либо при превышении клиентом разрешенного овердрафта,
либо при введении нулевого значения.
Класс должен после каждой операции указывать сумму на счете клиента,
а также количество операций вложения и количество операций снятия, произведенных клиентом.
 */

import java.util.Scanner;

public class Exercies15_50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("overdraft (-)");
        int overdraft = scanner.nextInt();
        if (overdraft > 0) {
            overdraft *= -1;
        }

        System.out.println("sum money");
        int sumMoney = scanner.nextInt();

        int entrance = 0;
        int exit = 0;

        while (true) {
            System.out.println("deal money (+ for add, - for exists)");
            int deal = scanner.nextInt();
            if (deal == 0) {
                break;
            }

            int tmpSumMoney = sumMoney + deal;
            if (tmpSumMoney < overdraft) {
                System.out.println("gerazanceciq overdraft@");
                break;
            }

            sumMoney = tmpSumMoney;
            System.out.println("qaarti vra mnac " + sumMoney + ": Unes ( " + overdraft + " ) overdraft");

            if (deal > 0) {
                entrance++;
            } else {
                exit++;
            }
        }
        System.out.println(entrance + " - mutq : " + exit + " - elq");
    }
}
