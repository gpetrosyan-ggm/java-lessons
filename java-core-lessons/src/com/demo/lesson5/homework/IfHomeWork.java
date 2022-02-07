package com.demo.lesson5.homework;

public class IfHomeWork {

    public static void main(String[] args) {
        simpleIfDemo();
        simpleIfElseDemo();
        simpleIfElseIfElseDemo();
        simpleNestedIfDemo();
    }

    /**
     * Write simple if example (գրել պարզ if֊ի օրինակ)
     */
    private static void simpleIfDemo() {

    }

    /**
     * Write simple if-else example  (գրել պարզ if֊else -ի օրինակ)
     */
    private static void simpleIfElseDemo() {

    }

    /**
     * Write simple if-else if-else example  (գրել պարզ if-else if-else֊ի օրինակ)
     */
    private static void simpleIfElseIfElseDemo() {

    }

    /**
     * Write simple if nested example (գրել պարզ if֊ի օրինակ, որի մեջ էլի if կա)
     */
    private static void simpleNestedIfDemo() {

    }

    /**
     * Calculate credit using month count and price (հաշվել վարկի գումարը օգտագործելով ամիսների քանակը և վարկի գումարը)
     *
     * 1. if monthCount >= 36
     *      k = 3000
     *      1.1 if creditPrice > 1000_000
     *          bonus = 2
     *      1.2 if creditPrice > 500_000
     *          bonus = 1
     * 2. if monthCount >= 24 and monthCount < 36
     *      k = 2000
     * 3. if monthCount >= 12 and monthCount < 24
     *      k = 1000
     * 4. if monthCount < 12
     *      k = 500
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
