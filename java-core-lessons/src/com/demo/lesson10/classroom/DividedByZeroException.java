package com.demo.lesson10.classroom;

public class DividedByZeroException extends ArithmeticException {

    public DividedByZeroException() {
        super();
    }

    public DividedByZeroException(String message, String logMessage) {
        super(message);
        System.out.println(logMessage);
    }

}
