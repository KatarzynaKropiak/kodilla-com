package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int noOfPosts;
    private int noOfComments;
    private int noOfForumUsers;
    private double averagePostsUser;
    private double averageCommentsUser;
    private double averageCommentsPost;

    public int getNoOfPosts() {
        return noOfPosts;
    }

    public int getNoOfComments() {
        return noOfComments;
    }

    public int getNoOfForumUsers() {
        return noOfForumUsers;
    }

    public double getAveragePostsUser() {
        return averagePostsUser;
    }

    public double getAverageCommentsUser() {
        return averageCommentsUser;
    }

    public double getAverageCommentsPost() {
        return averageCommentsPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        noOfComments = statistics.commentsCount();
        noOfPosts = statistics.postsCount();
        noOfForumUsers = statistics.usersNames().size();
        if (noOfForumUsers != 0) {
            averagePostsUser = (double) noOfPosts / noOfForumUsers;
            averageCommentsUser = (double) noOfComments / noOfForumUsers;
        } else {
            averagePostsUser = 0;
            averageCommentsUser = 0;
        }
        if (noOfPosts != 0) {
            averageCommentsPost = (double) noOfComments / noOfPosts;
        } else {
            averageCommentsPost = 0;
        }
    }
    public void showStatistics() {
        System.out.println("\nIf no of users is " + noOfForumUsers + " and no of posts on forum is " + noOfPosts
                + ", then average number of posts per User is " + String.format("%.2f", averagePostsUser));
        System.out.println("If no of users is " + noOfForumUsers + " and no of comments on forum is " + noOfComments
                + ", then average number of comments per User is " + String.format("%.2f", averageCommentsUser));
        System.out.println("If no of posts is " + noOfPosts + " and no of comments on forum is " + noOfComments
                + ", then average number of comments per post is " + String.format("%.2f", averageCommentsPost));
    }
}

