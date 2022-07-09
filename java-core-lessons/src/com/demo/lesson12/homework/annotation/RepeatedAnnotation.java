package com.demo.lesson12.homework.annotation;

import java.lang.annotation.*;

@Documented
@MarkerAnnotation
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatedAnnotation {

    MyWritingAnnotation[] value();

}