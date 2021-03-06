package com.demo.lesson5.homework;

public class IfHomeWork {

    public static void main(String[] args) {

        simpleIfDemo();
        simpleIfElseDemo();
        simpleIfElseIfElseDemo();
        simpleNestedIfDemo();
        calculateCredit(6, 400_000);
    }

    /**
     * Write simple if example (գրել պարզ if֊ի օրինակ)
     */
    private static void simpleIfDemo() {
        int i = 10;
        double j = 10.00001;
        if (i < j) {
            System.out.println("pat = true");
        }
    }

    /**
     * Write simple if-else example  (գրել պարզ if֊else -ի օրինակ)
     */
    private static void simpleIfElseDemo() {
        int i = 10;
        double j = 10.00001;

        if (i > j) {
            System.out.println("pat = " + true);
        } else {
            System.out.println("pat = " + false);
        }
    }

    /**
     * Write simple if-else if-else example  (գրել պարզ if-else if-else֊ի օրինակ)
     */
    private static void simpleIfElseIfElseDemo() {
        int i = 0;
        int j = 5;
        if (i > j) {
            System.out.println("1. " + (i - j));
        } else if (j == i) {
            System.out.println("2. " + (i - j));
        } else if (j > i) {
            System.out.println("3. " + (i - j));
        } else {
            System.out.println("4. " + false); // avelord else block e, erbeq chi mtnelu
        }
    }

    /**
     * Write simple if nested example (գրել պարզ if֊ի օրինակ, որի մեջ էլի if կա)
     */
    private static void simpleNestedIfDemo() {
        int i = 0;
        int k = 0;
        int j = 20;
        if (i == 15) {
            if (k > i) {
                if (k < j) {
                    System.out.println("1. " + k);
                }
            }
        }

    }

    /**
     * Calculate credit using month count and price (հաշվել վարկի գումարը օգտագործելով ամիսների քանակը և վարկի գումարը)
     * <p>
     * 1. if monthCount >= 36
     * k = 3000
     * 1.1 if creditPrice > 1000_000
     * bonus = 2
     * 1.2 if creditPrice > 500_000
     * bonus = 1
     * 2. if monthCount >= 24 and monthCount < 36
     * k = 2000
     * 3. if monthCount >= 12 and monthCount < 24
     * k = 1000
     * 4. if monthCount < 12
     * k = 500
     * <p>
     * 1. if creditPrice > 1000_000
     * discount = 5
     * 2. if creditPrice > 500_000
     * discount = 3
     * <p>
     * finalPrice = monthCount * k + creditPrice  (finalPrice = վերջնական գումար, k = գործակից որը պիտի գտնել)
     * <p>
     * (discount = զեղջ, bonus = բոնուս)
     * if there are discount or bonus update finalPrice (եթե կա զեղջ կամ բոնուս ապա finalPrice փոխել ներքևի բանաձևով)
     * finalPrice += finalPrice * (discount + bonus) / 100
     *
     * @param monthCount  the month count (ամիսների քանակը)
     * @param creditPrice the credit price value (վարկի գումարը)
     */
    private static void calculateCredit(int monthCount, double creditPrice) {
        int discount = 0;
        int bonus = 0;
        int k;
        double finalPrice;

        if (monthCount >= 36) {
            k = 3000;
            if (creditPrice > 1000_000) {
                bonus = 2;
            } else if (creditPrice > 500_000) {
                bonus = 1;
            }
        } else if (monthCount >= 24) {
            k = 2000;
        } else if (monthCount >= 12) {
            k = 1000;
        } else {
            k = 500;
        }

        if (creditPrice > 1000_000) {
            discount = 5;
        } else if (creditPrice > 500_000) {
            discount = 3;
        }

        finalPrice = monthCount * k + creditPrice;
        if (bonus != 0 || discount != 0) {
            finalPrice += finalPrice * (discount + bonus) / 100;
        }

        System.out.println("ajqis senca chisht@ " + finalPrice);
    }

}
