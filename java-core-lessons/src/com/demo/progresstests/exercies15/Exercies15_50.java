package com.demo.progresstests.exercies15;
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
// es xndir@ @ndhanrapes chem haskanum, fantaziais zor em tvel u lucel, kbacatres incha uzum

import java.util.Scanner;

public class Exercies15_50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("overdraft");
        int overdraft = scanner.nextInt();
        System.out.println("sum money");
        int sumMoney = scanner.nextInt();

        int sum = overdraft + sumMoney;
        int deal = 0;
        int gnum = 0;
        int enterace = 0;
        int exit = 0;

        while (true) {
            System.out.println("enterance exit");
            int enteranceExit = scanner.nextInt();
            if (enteranceExit == 0) {
                break;
            }
            System.out.println("qaarti vra mnac " + (sumMoney - enteranceExit));
            deal += enteranceExit;
            if (deal > overdraft) {
                System.out.println("gerazanceciq overdraft@");
                break;
            }
            if (enteranceExit > 0) {
                enterace--;
            } else {
                exit++;
            }
        }
        System.out.println(enterace + " -mutq : " + exit + " - elq");
    }
}
