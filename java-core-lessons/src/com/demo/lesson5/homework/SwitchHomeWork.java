package com.demo.lesson5.homework;

import java.security.InvalidParameterException;

public class SwitchHomeWork {

    public static void main(String[] args) {
        simpleSwitchDemo();
        simpleSwitchGroupDemo(1);
        simpleSwitchGroupDemo(5);
        simpleSwitchNestedDemo();
        calculateCredit(36, 1_000_010);
        calculateCredit(40, 1_000_010);
    }

    /**
     * Write simple switch example (գրել պարզ switch֊ի օրինակ)
     */
    private static void simpleSwitchDemo() {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("arajin or erkushabti");
                break;
            case 2:
                System.out.println("erkrord or ereqshabti");
                break;
            case 3:
                System.out.println("errord or choreqhabti");
                break;
            case 4:
                System.out.println("chorord or hingshabti");
                break;
            case 5:
                System.out.println("hingerord or urbat");
                break;
            case 6:
                System.out.println("vecerord or shabat");
                break;
            case 7:
                System.out.println("hangstan or kiraki");
                break;
        }
    }

    /**
     * Write simple switch with groups example  (գրել պարզ switch-ի օրինակ case֊երը գրուպ արած)
     */
    private static void simpleSwitchGroupDemo(int i) {
        switch (i) {
            case 1, 2, 3, 4, 5:
                System.out.println("ashxatanqaiin or");
                break;
            case 6:
            case 7:
                System.out.println("hangstyan or (normal mardkanc mot)");
                break;
        }
    }

    /**
     * Write simple switch nested example (գրել պարզ switch֊ի օրինակ, որի մեջ էլի switch կա)
     */
    private static void simpleSwitchNestedDemo() {
        int year = 0;
        int months = 5;

        switch (year) {
            case 0:
                System.out.println("tari");

                switch (months) {
                    case 1:
                        System.out.println("hunvar");
                        break;
                    case 2:
                        System.out.println("petrvar");
                        break;
                    case 3:
                        System.out.println("mart");
                        break;
                    case 4:
                        System.out.println("april");
                        break;
                    case 5:
                        System.out.println("mayis");
                        break;
                    case 6:
                        System.out.println("hunis");
                        break;
                    case 7:
                        System.out.println("hulis");
                        break;
                    case 8:
                        System.out.println("ogosto");
                        break;
                    case 9:
                        System.out.println("september");
                        break;
                    case 10:
                        System.out.println("hoktember");
                        break;
                    case 11:
                        System.out.println("noember");
                        break;
                    case 12:
                        System.out.println("dektember");
                        break;
                }
        }
    }

    /**
     * Calculate credit using month count and price (հաշվել վարկի գումարը օգտագործելով ամիսների քանակը և վարկի գումարը)
     * <p>
     * 1. if monthCount = 36
     * k = 3000
     * 1.1 if creditPrice > 1000_000
     * bonus = 2
     * 1.2 if creditPrice > 500_000
     * bonus = 1
     * 2. if monthCount = 24
     * k = 2000
     * 3. if monthCount = 12
     * k = 1000
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
        if (monthCount != 12 &&
            monthCount != 24 &&
            monthCount != 36 &&
            creditPrice <= 50_000) {
            throw new InvalidParameterException("Invalid Month count");
        }

        if (creditPrice <= 50_000) {
            throw new InvalidParameterException("Invalid Credit price");
        }

        int k = 0;
        int bonus = 0;
        int discount = 0;
        double finalPrice;

        switch (monthCount) {
            case 36:
                k = 3000;
                if (creditPrice > 1_000_000) {
                    bonus = 2;
                } else if (creditPrice > 500_000) {
                    bonus = 1;
                }
            case 24:
                k = 2000;
            case 12:
                k = 1000;
        }

        if (k != 0) {
            if (creditPrice > 1_000_000) {
                discount = 5;
            } else if (creditPrice > 500_000) {
                discount = 3;
            }

            finalPrice = monthCount * k + creditPrice;
            if (discount != 0 || bonus != 0) {
                finalPrice += finalPrice * (discount + bonus) / 100;
            }
            System.out.println(finalPrice);
        }

    }

}
