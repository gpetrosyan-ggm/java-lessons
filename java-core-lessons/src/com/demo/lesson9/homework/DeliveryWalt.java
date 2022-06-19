package com.demo.lesson9.homework;

public class DeliveryWalt implements Delivery{
    @Override
    public int service(Customer customer) {
        System.out.println(customer);
        return 0;
    }

    @Override
    public void information(Customer customer) {
        System.out.println("Walt " + customer);
    }
}
