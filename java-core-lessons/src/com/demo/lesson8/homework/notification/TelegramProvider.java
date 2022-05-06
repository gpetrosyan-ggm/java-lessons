package com.demo.lesson8.homework.notification;

public class TelegramProvider extends NotificationProvider {

    public TelegramProvider() {
        super(Constant.TELEGRAM);
    }

    @Override
    public boolean sendNotification(String chat, String message) {
        System.out.println(chat + " " + message);
        System.out.println("TelegramProvider");
        return false;
    }
}
