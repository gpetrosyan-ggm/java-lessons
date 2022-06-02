package com.demo.lesson9.classroom.interfaces.base;

public class MessageProviderDemo {

    public static void main(String[] args) {
        ViberMessageProvider messageProviderViber = new ViberMessageProvider();
        WhatsAppMessageProvider messageProviderWhatsApp = new WhatsAppMessageProvider();
//        MessageProvider messageProviderTelegram = new TelegramMessageProvider();

        messageProviderViber.test();
        send(messageProviderViber, "Test", "Arni");
        send(messageProviderWhatsApp, "Test", "Gor");
//        send(messageProviderTelegram, "Test", "Jon");
    }

    private static void send(MessageProvider messageProvider, String body, String to) {
        messageProvider.checkSent();
        boolean sent = messageProvider.send(body, to);
        if (!sent) {
            String telegram = messageProvider.TELEGRAM;
            new TelegramMessageProvider().send(body, to);
        }
    }

    public static void getProviderType(Constants constants) {

    }

}
