package com.demo.lesson9.classroom.interfaces.base;

public abstract class OkMessageProvider implements MessageProvider {

    @Override
    public boolean send(String body, String to) {
        return false;
    }

}
