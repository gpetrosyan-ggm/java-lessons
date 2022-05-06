package com.demo.lesson8.homework.notification;

public abstract class NotificationProvider {

    public String type;

    public NotificationProvider(String type) {
        this.type = type;
    }

    public abstract boolean sendNotification(String chat, String message);
}

