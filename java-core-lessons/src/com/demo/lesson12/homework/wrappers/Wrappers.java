package com.demo.lesson12.homework.wrappers;


public class Wrappers {

    public Byte testByte(Byte b) {
        System.out.println(b);
        return b;
    }

    public Short testShort(short c) {
        System.out.println(c / 2);
        return c;
    }

    public Integer testInteger(Byte b, int c) {
        Integer i = b + c;
        return i;
    }

    public void testLong() {
        Long l = Long.valueOf(12);
        System.out.println(l);
    }

    public Double testDouble(Double d) {
        Integer i = Integer.valueOf(13);
        double dd = i + d;
        return dd;
    }

    public void testChar() {
        Character ch = Character.valueOf('a');
        System.out.println(ch);
    }

    public void testBoolean(Double d, Boolean b) {
        int i = 3;
        if (i > Double.valueOf(Math.sqrt(d))) {
            System.out.println(b);
        } else {
            System.out.println(!b);
        }
    }
}
