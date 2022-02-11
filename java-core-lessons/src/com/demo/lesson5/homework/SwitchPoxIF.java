package com.demo.lesson5.homework;

import java.security.InvalidParameterException;

public class SwitchPoxIF {
    public static void main(String[] args) {
        switchIf(12, 300_000);
    }

    private static void switchIf(int monthCount, double creditPrice) {
        int k = 0;
        int bonus = 0;
        int discount = 0;
        double finalPrice;
        if (monthCount != 12 && monthCount != 24 && monthCount != 36) {
            throw new InvalidParameterException("Invalid Month count");
        }
        if (creditPrice <= 50_000) {
            throw new InvalidParameterException("Invalid Credit price");
        }
        if (monthCount == 36) {
            k = 3000;
            if (creditPrice > 1_000_000) {
                bonus = 2;
            } else if (creditPrice > 500_000) {
                bonus = 1;
            }
        } else if (monthCount == 24) {
            k = 2000;
        } else if (monthCount == 12) {
            k = 1000;
        }
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





