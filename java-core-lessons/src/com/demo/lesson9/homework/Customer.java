package com.demo.lesson9.homework;

public class Customer {

    private String order;
    private int timeDelivery;
    private String contactPhone;

    public Customer(String order, int timeDelivery, String contactPhone) {
        this.order = order;
        this.timeDelivery = timeDelivery;
        this.contactPhone = contactPhone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("order='").append(order).append('\'');
        sb.append(", timeDelivery=").append(timeDelivery);
        sb.append(", contactPhone='").append(contactPhone).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
