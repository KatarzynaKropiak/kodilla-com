package com.kodilla.stream.forumuser;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(0001, "Lukas", 'M', 2003, 11, 21, 5));
        theUserList.add(new ForumUser(0002, "Emma", 'F', 2011, 05, 04, 1));
        theUserList.add(new ForumUser(0003, "Adam", 'M', 1988, 07, 30, 0));
        theUserList.add(new ForumUser(0004, "Julius", 'M', 1979, 04, 07, 32));
        theUserList.add(new ForumUser(0005, "Anna", 'F', 1976, 03, 04, 14));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);


    }
}
