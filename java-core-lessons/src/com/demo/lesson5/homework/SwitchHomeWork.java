package com.demo.lesson5.homework;

public class SwitchHomeWork {

    public static void main(String[] args) {
        simpleSwitchDemo();
        simpleSwitchGroupDemo();
        simpleSwitchNestedDemo();
        calculateCredit(36, 1_000_010);
    }

    /**
     * Write simple switch example (գրել պարզ switch֊ի օրինակ)
     */
    private static void simpleSwitchDemo() {
        int saturday;
        switch (saturday = 2) {
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
    private static void simpleSwitchGroupDemo() {
        int i;                        // skzbum grel eyi  int saturday;
        for (i = 1; i < 8; i++) {     // swich (saturdey = ?)
            // heto poxeci senc sax patasxanneri hamar
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("ashxatanqaiin or");
                    break;
                case 6:
                case 7:
                    System.out.println("hangstyan or (normal mardkanc mot)");
                    break;


            }

        }
    }

    /**
     * Write simple switch nested example (գրել պարզ switch֊ի օրինակ, որի մեջ էլի switch կա)
     */
    private static void simpleSwitchNestedDemo() {
        int year;
        int months;

        switch (year = 0) {
            case 0:
                System.out.println("tari");

                switch (months = 5) {
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
     * finalPrice = finalPrice * (discount + bonus) / 100
     *
     * @param monthCount  the month count (ամիսների քանակը)
     * @param creditPrice the credit price value (վարկի գումարը)
     */
    private static void calculateCredit(int monthCount, double creditPrice) {
        int discount = 0;
        int bonus = 0;
        double finalPrice;

        switch (monthCount = 36) {
            case 1:
            if (creditPrice >= 1000_000) {
                bonus = 2;
                discount = 5;
            }
            if (creditPrice > 500_000) {
                bonus = 1;
                discount = 3;

            }
            System.out.println("1. " + (monthCount * 3000 + creditPrice) * (discount + bonus) / 100);
            break;
        }
        switch (monthCount = 24) {
            case 2:
            finalPrice = (monthCount * 2000 + creditPrice);
            System.out.println("2. " + finalPrice);
            break;
        }
        switch (monthCount = 12) {
            case 3:
            System.out.println("3. " + monthCount * 1000 + creditPrice);
            break;
            default: System.out.println("error");

        }



        }
    }
// im jogelov chisht em grel, bayc patasxan chem stanum, defaulta linum




