package com.demo.lesson12.classroom.annotations.general;

public class FirstAnnotationTest {

    @FirstAnnotation(str = "AAAA")
    private String name;

    @FirstAnnotation(i = 10)
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
