package com.demo.lesson12.homework.enums;

public enum University {

    PERFECTLY(81, 100),                    // gerazanc
    AVERAGE_RATING(61, 80),               // harvacain
    SATISFACTORY_RATING(40, 60),          // mijak
    UNSATISFACTORY_RATING(0, 39);         // anbavarar

    private int min;
    private int max;

    University(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
