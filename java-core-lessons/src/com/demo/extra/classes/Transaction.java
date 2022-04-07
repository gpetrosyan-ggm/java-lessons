package com.demo.extra.classes;

import java.util.Random;

public class Transaction {

    int id;

    double price;

    User user;

    Item[] items;

    public Transaction(User user) {
        this.user = user;

//        Random random = new Random();
        id = new Random().nextInt();
    }

    public void calculatePrice() {
        double priceTmp = 0;
        if (items == null || items.length == 0) {
            priceTmp = 0;
        } else {
            for (Item item : items) {
                priceTmp += item.price;
            }
        }
        this.price = priceTmp;
    }

}
