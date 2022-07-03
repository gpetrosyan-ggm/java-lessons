package com.demo.lesson12.classroom.enums;

public enum Answers {

    YES(5, "yes"),
    NO(2, "no"),
    MAYBE(3, "maybe"),
    UNKNOWN(1, "unknown"),
    UNKNOWN_1(1, "unknown", "AAA"),
    TEST(1);

    private int rating;
    private String name;
    private String aa;

    Answers(int rating, String name) {
        this.rating = rating;
        this.name = name;
    }

    Answers(int rating, String name, String a) {
        this.rating = rating;
        this.name = name;
        this.aa = a;
    }

    Answers(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

}
