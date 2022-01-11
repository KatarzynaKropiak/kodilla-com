package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idUser;
    private final String name;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int noOfPosts;

    public ForumUser(int idUser, String name, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int noOfPosts) {
        this.idUser = idUser;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.noOfPosts = noOfPosts;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNoOfPosts() {
        return noOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idUser=" + idUser +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", noOfPosts=" + noOfPosts +
                '}';
    }
}
