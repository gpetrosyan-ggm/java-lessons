package com.demo.lesson9.classroom.interfaces.base;

public class ViberMessageProvider implements MessageProvider, DeliveryProvider {

    @Override
    public boolean send(String body, String to) {
        System.out.printf("Sent message '%s' to '%s' by Viber successfully.%s", body, to, "\n");
        return true;
    }

    public void test() {
        System.out.println("Viber test");
    }

    @Override
    public void delivery(String obj) {

    }

}
