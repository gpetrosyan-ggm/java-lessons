package com.demo.lesson5.homework;

public class SwitchHomeWork {

    public static void main(String[] args) {
        simpleSwitchDemo();
        simpleSwitchGroupDemo();
        simpleSwitchNestedDemo();
    }

    /**
     * Write simple switch example (գրել պարզ switch֊ի օրինակ)
     */
    private static void simpleSwitchDemo() {

    }

    /**
     * Write simple switch with groups example  (գրել պարզ switch-ի օրինակ case֊երը գրուպ արած)
     */
    private static void simpleSwitchGroupDemo() {

    }

    /**
     * Write simple switch nested example (գրել պարզ switch֊ի օրինակ, որի մեջ էլի switch կա)
     */
    private static void simpleSwitchNestedDemo() {

    }

    /**
     * Calculate credit using month count and price (հաշվել վարկի գումարը օգտագործելով ամիսների քանակը և վարկի գումարը)
     *
     * 1. if monthCount = 36
     *      k = 3000
     *      1.1 if creditPrice > 1000_000
     *          bonus = 2
     *      1.2 if creditPrice > 500_000
     *          bonus = 1
     * 2. if monthCount = 24
     *      k = 2000
     * 3. if monthCount = 12
     *      k = 1000
     *
     * 1. if creditPrice > 1000_000
     *      discount = 5
     * 2. if creditPrice > 500_000
     *      discount = 3
     *
     * finalPrice = monthCount * k + creditPrice  (finalPrice = վերջնական գումար, k = գործակից որը պիտի գտնել)
     *
     * (discount = զեղջ, bonus = բոնուս)
     * if there are discount or bonus update finalPrice (եթե կա զեղջ կամ բոնուս ապա finalPrice փոխել ներքևի բանաձևով)
     * finalPrice = finalPrice * (discount + bonus) / 100
     *
     * @param monthCount  the month count (ամիսների քանակը)
     * @param creditPrice the credit price value (վարկի գումարը)
     */
    private static void calculateCredit(int monthCount, double creditPrice) {

    }

}
