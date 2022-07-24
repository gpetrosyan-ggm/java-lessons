package com.demo.lesson12.homework.repeating.annotation;


import java.lang.annotation.*;
@Documented
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatableAnno {

    String name();

    int age();
}
