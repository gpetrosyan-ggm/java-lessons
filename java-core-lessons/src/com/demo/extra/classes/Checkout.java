package com.demo.extra.classes;

public class Checkout {

    public Transaction checkout(User user, Item[] items) {
        Transaction transaction = new Transaction(user);
        transaction.calculatePrice();
        System.out.println(transaction.price);

        transaction.items = items;
        transaction.calculatePrice();
        System.out.println(transaction.price);
        return transaction;
    }

}
