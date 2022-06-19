package com.demo.lesson9.homework;

public interface Delivery {

    int service(Customer customer);

    default void information(Customer customer) {
        System.out.println(customer);
    }

}
