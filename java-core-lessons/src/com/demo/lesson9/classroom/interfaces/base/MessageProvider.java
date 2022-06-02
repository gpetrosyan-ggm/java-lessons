package com.demo.lesson9.classroom.interfaces.base;

public interface MessageProvider extends Constants, DeliveryProvider {

    boolean send(String body, String to);

    default void checkSent() {
        check();
        System.out.println("SENT");
    }

    default void checkReceive() {
        check();
        System.out.println("RECEIVE");
    }

    static int getMessageId() {
        return 1;
    }

    private void check() {
        System.out.println("Check Message Provider");
    }

}
