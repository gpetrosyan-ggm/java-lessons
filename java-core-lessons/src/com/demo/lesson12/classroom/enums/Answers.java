package com.demo.lesson12.classroom.enums;

public enum Answers {

    YES(5, "yes"),
    NO(2, "no"),
    MAYBE(3, "maybe"),
    UNKNOWN(1, "unknown");

    private final int rating;
    private final String name;

    Answers(int rating, String name) {
        this.rating = rating;
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

}
