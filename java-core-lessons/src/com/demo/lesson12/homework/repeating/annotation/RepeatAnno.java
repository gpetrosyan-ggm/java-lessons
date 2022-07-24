package com.demo.lesson12.homework.repeating.annotation;

import java.lang.annotation.*;


@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatAnno {

    RepeatableAnno[] value();

}