package com.demo.lesson12.classroom.annotations.repeat;

public class RepeatAnnotationTest {

    @RepeatedAnnotation({
            @RepeatableAnnotation(name = "Jon", age = 35, type = RepeatableAnnotation.RepeatableTypes.AAA),
            @RepeatableAnnotation(name = "Tom", age = 45, type = RepeatableAnnotation.RepeatableTypes.BBB),
            @RepeatableAnnotation(name = "Clara", age = 21, type = RepeatableAnnotation.RepeatableTypes.CCC)
    })
    private String name = "AAA";

}
