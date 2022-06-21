package com.demo.lesson10.classroom;

public class InvalidInputTestException extends Exception {

    public InvalidInputTestException() {
        super();
    }

    public InvalidInputTestException(String message, String logMessage) {
        super(message);
        System.out.println(logMessage);
    }

}
