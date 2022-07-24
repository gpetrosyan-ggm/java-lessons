package com.demo.lesson12.homework.single.annotation;

import com.demo.lesson12.classroom.annotations.single.SingleMemberAnnotation;

public class SingleAnnotationTest {
    @SingleAnnotation()
    private String name;

    @SingleAnnotation(1987)
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
