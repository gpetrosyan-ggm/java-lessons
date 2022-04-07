package com.demo.extra.classes;

import java.util.Random;

public class Item {

    String type;

    String name;

    double price;

    boolean inStock;

    public Item(String type, String name) {
        this.type = type;
        this.name = name;
        this.price = new Random().nextDouble();
    }

}
