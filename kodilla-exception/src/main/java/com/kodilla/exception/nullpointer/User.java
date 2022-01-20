package com.kodilla.exception.nullpointer;

import java.util.Optional;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
