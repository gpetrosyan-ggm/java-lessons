package com.demo.lesson12.classroom.annotations.repeat;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatedAnnotation {

    RepeatableAnnotation[] value();

}
