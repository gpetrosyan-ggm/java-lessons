package com.demo.extra.gsetter;

import java.security.InvalidParameterException;

public class User {

    private String name;

    private Long age;

    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Long age) {
        if (age > 50) {
            throw new InvalidParameterException();
        }
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Long getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "User{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }

}
