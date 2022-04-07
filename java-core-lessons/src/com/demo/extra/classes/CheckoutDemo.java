package com.demo.extra.classes;

public class CheckoutDemo {

    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        User user = new User("Arnold", "arnold@gmail.com");
        user.lastName = "Martirosyan";

        Item item1 = new Item("BEER", "Kilikia");
        Item item2 = new Item("MILKD", "Biokat");
        Item[] items = {item1, item2};

        Transaction transaction = checkout.checkout(user, items);
        System.out.println(transaction.id);
        System.out.println(transaction.price);
    }

}
