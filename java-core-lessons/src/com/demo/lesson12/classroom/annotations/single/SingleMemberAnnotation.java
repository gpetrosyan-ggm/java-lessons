package com.demo.lesson12.classroom.annotations.single;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SingleMemberAnnotation {

    int value() default 5;

    double d() default 15;

}
