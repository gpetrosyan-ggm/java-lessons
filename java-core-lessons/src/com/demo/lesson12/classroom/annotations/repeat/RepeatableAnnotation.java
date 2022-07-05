package com.demo.lesson12.classroom.annotations.repeat;

import java.lang.annotation.*;

@Documented
@Repeatable(RepeatedAnnotation.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatableAnnotation {

    String name();

    int age();

    RepeatableTypes type();

    enum RepeatableTypes {
        AAA,
        BBB,
        CCC
    }

}
