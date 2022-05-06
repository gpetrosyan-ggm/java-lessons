package com.demo.lesson8.homework.notification;

public class WhatsAppProvider extends NotificationProvider {

    public WhatsAppProvider() {
        super(Constant.WHATSAPP);
    }

    @Override
    public boolean sendNotification(String chat, String message) {
        System.out.println(chat + " " + message);
        System.out.println("WhatsAppProvider");
        return false;
    }
}
