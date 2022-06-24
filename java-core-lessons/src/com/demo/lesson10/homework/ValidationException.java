package com.demo.lesson10.homework;

public class ValidationException extends Exception {
    public ValidationException() {
        super();
    }

    public ValidationException(String message, String logmessage) {
        super(message);
        System.out.println(logmessage +" a");
    }

}
