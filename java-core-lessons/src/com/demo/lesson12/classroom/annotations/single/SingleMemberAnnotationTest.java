package com.demo.lesson12.classroom.annotations.single;

public class SingleMemberAnnotationTest {

    @SingleMemberAnnotation(value = 12, d = 5)
    private String name;

    @SingleMemberAnnotation(55)
    private String srName;

}
