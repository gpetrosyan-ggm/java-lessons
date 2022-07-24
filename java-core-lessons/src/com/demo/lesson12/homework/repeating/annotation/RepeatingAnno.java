package com.demo.lesson12.homework.repeating.annotation;

public class RepeatingAnno {

    @RepeatAnno({
            @RepeatableAnno(name = "Jon", age = 35),
            @RepeatableAnno(name = "Tom", age = 45),
            @RepeatableAnno(name = "Clara", age = 21)
    })
    int a;
}
