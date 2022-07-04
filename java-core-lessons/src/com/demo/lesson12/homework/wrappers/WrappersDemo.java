package com.demo.lesson12.homework.wrappers;

public class WrappersDemo {
    public static void main(String[] args) {
        Wrappers wrappers = new Wrappers();

        wrappers.testByte((byte) 12);
        wrappers.testShort((short) 45);
        System.out.println(wrappers.testInteger((byte) 12, 34));
        wrappers.testLong();
        System.out.println(wrappers.testDouble(23.34));
        wrappers.testChar();
        wrappers.testBoolean(23.56, true);
    }
}
