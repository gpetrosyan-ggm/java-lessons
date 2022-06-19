package com.demo.lesson9.homework;

public class DeliveryDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("arevtri cucak", 35, "+374 99 99 99 99");

        delivery(customer, getDelivery(6, 7000));
        delivery(customer, getDelivery(14, 790));
        delivery(customer, getDelivery(140, 1790));
    }

    private static void delivery(Customer customer, Delivery delivery) {
        delivery.information(customer);
        delivery.service(customer);
    }

    private static Delivery getDelivery(int weight, int distance) {
        if (weight < 10 && distance < 1000) {
            System.out.println("araqum votqov e");
            return new DeliveryWalt();
        }
        if (weight < 100 && distance < 7000) {
            System.out.println("araqum@ motoyov");
            return new DeliveryMotorbike();
        }
        System.out.println("araqum@ avtoyov");
        return new DeliveryАutomobile();
    }
}
