package com.demo.lesson10.classroom;

public class ExceptionHandlingBaseDemo {

    // try, catch, finally, throw, throws

    public static void main(String[] args) {
        try {
//            example2_1Demo(1, 1);
//            System.out.println();

            example2_1Demo(1, 0);
            System.out.println();

//            example2_1Demo(1001, 1);
        } catch (InvalidTestException e) {
            e.printStackTrace();
            if (e.getCause() != null) {
                e.getCause().printStackTrace();
            }
        }
    }

    private static void example1(int a, int b) {
        try {
            if (a > 1000) {
                throw new Exception("Over 1000");
            }
            if (b == 0) {
                throw new DividedByZeroException("Invalid input", "B is zero and could not divided.");
            }
            System.out.println(a / b);
        } catch (DividedByZeroException e) {
            e.printStackTrace();
            System.out.println("DividedByZeroException");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception");
        } finally {
            System.out.println("FINALLY");
        }
    }

    private static void example2Demo(int a, int b) {
        try {
            example2(a, b);
        } catch (DividedByZeroException e) {
            e.printStackTrace();
        } catch (InvalidInputTestException e) {
            e.printStackTrace();
        }
    }

    private static void example2_1Demo(int a, int b) throws InvalidTestException {
        try {
            example2(a, b);
        } catch (DividedByZeroException | InvalidInputTestException e) {
            InvalidTestException ex = new InvalidTestException();
            ex.initCause(e);
            throw ex;
        }
    }

    private static void example2(int a, int b) throws InvalidInputTestException, DividedByZeroException {
        if (a > 1000) {
            throw new InvalidInputTestException();
        }
        if (b == 0) {
            throw new DividedByZeroException("Invalid input", "B is zero and could not divided.");
        }
        System.out.println(a / b);
    }

}
