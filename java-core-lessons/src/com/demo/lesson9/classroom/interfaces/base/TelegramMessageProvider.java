package com.demo.lesson9.classroom.interfaces.base;

public class TelegramMessageProvider implements MessageProvider {

    @Override
    public boolean send(String body, String to) {
        System.out.println("Telegram message id: " + StaticInter.getMessageId());
        System.out.printf("Sent message '%s' to '%s' by Telegram successfully.%s", body, to, "\n");
        return true;
    }

    @Override
    public void delivery(String obj) {

    }

}
