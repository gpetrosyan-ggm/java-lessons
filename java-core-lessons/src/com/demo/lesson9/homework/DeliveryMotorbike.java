package com.demo.lesson9.homework;

public class DeliveryMotorbike implements Delivery{
    @Override
    public int service(Customer customer) {
        System.out.println(customer);
        return 0;
    }


}
