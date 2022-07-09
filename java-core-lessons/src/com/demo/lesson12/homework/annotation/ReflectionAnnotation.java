package com.demo.lesson12.homework.annotation;

public class ReflectionAnnotation {
    @MyWritingAnnotation(age = 35)
    private String name;

    @MyWritingAnnotation(age = 27, months = "february")
    private String srName;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrName() {
        return srName;
    }

    public void setSrName(String srName) {
        this.srName = srName;
    }
}
