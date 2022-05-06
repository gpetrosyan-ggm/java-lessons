package com.demo.lesson8.homework.notification;

public class ViberProvider extends NotificationProvider {

    public ViberProvider() {
        super(Constant.VIBER);
    }

    @Override
    public boolean sendNotification(String chat, String message) {
        System.out.println(chat + " " + message);
        System.out.println("ViberProvider");
        return false;
    }
}
