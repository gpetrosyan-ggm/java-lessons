package com.demo.extra.classes;

import java.util.Random;

public class User {

    int id;

    String firstName;

    String lastName;

    String email;

    public User(String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
        this.id = new Random().nextInt();
    }

}
