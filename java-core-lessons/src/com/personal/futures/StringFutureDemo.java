package com.personal.futures;

import java.util.stream.Collectors;

public class StringFutureDemo {

    public static void main(String[] args) {
        String s1 = "   a as dasd\n a  a \nas.          ";
        System.out.printf("S1: '%s' \n", s1);
        System.out.printf("S1 Trim: '%s' \n", s1.trim());
        System.out.printf("S1 Strip: '%s' \n", s1.strip());
        System.out.printf("S1 isEmpty: '%s' \n", s1.isEmpty());
        System.out.printf("S1 isBlank: '%s' \n", s1.isBlank());
        System.out.printf("S1 Repeat: '%s' \n", s1.repeat(5));
        System.out.printf("S1 Lines: '%s' \n", s1.lines().collect(Collectors.toSet()).toString());
        System.out.printf("S1 Indent: '%s' \n", s1.indent(10));
        System.out.printf("S1 Transform: '%s' \n", s1.transform(StringFutureDemo::transform));
        System.out.printf("S1 DescribeConstable: '%s' \n", s1.describeConstable());
    }

    public static String transform(String s) {
        return s + "transform";
    }

}
