package com.demo.lesson9.classroom.interfaces.base;

public class WhatsAppMessageProvider implements MessageProvider {

    @Override
    public boolean send(String body, String to) {
        System.out.printf("Sent message '%s' to '%s' by WhatsApp failed.%s", body, to, "\n");
        return false;
    }

    @Override
    public void delivery(String obj) {

    }

    @Override
    public void checkSent() {
        System.out.println("Check WhatsApp Provider");
    }

}