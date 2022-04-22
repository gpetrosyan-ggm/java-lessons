package com.demo.lesson7.examples;

public class BookOverload7 {
    public static void main(String[] args) {
        BookExampl_7 bookExampl_7 = new BookExampl_7();
        double result;
        bookExampl_7.test();
        bookExampl_7.test(10);
        bookExampl_7.test(10, 20);
        result = bookExampl_7.test(123.45);
        System.out.println(result);
    }
}
