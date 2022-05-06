package com.demo.lesson8.homework.notification;

public class NotificationProviderDemo {
    public static void main(String[] args) {

        send(Constant.VIBER, "Karen", "voxjuyn");
        send(Constant.WHATSAPP, "Srsen", "barev");
        send(Constant.TELEGRAM, "Armen", "privet");
    }

    static void send(String type, String chat, String message) {
        NotificationProvider provider;
        switch (type) {
            case Constant.VIBER:
                provider = new ViberProvider();
                break;
            case Constant.WHATSAPP:
                provider = new WhatsAppProvider();
                break;
            case Constant.TELEGRAM:
                provider = new TelegramProvider();
                break;
            default:
                throw new RuntimeException();
        }
        provider.sendNotification(chat, message);
    }
}


