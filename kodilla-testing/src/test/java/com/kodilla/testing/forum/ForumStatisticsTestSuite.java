package com.kodilla.testing.forum;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class ForumStatisticsTestSuite {
    @Mock
 private Statistics statisticsMock;

    @BeforeEach
    public void before() {
        List<String> userNames = new ArrayList<>();
        userNames.add("Ambroży");
        userNames.add("Bazyli");
        userNames.add("Cyryl");
        userNames.add("Dionizy");
        userNames.add("Eugenisz");
        userNames.add("Feliks");

        when(statisticsMock.usersNames()).thenReturn(userNames);
    }

    @Test
    void testWhenNoOfPostIs0() {

        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(0);
    //    when(statisticsMock.usersNames()).thenReturn(userNames);

          ForumStatistics forumStatistics = new ForumStatistics();
          forumStatistics.calculateAdvStatistics(statisticsMock);
          forumStatistics.showStatistics();

        assertEquals(0, forumStatistics.getAverageCommentsPost());
        assertEquals(0, forumStatistics.getAveragePostsUser());

    }
    @Test
    void testWhenNoOfPostIs1000() {
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        assertEquals(0, forumStatistics.getAverageCommentsPost(),0.01);
        assertEquals(166.67, forumStatistics.getAveragePostsUser(),0.01);

    }
    @Test
    void testWhenNoOfCommentsIs0() {
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(100);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        assertEquals(0, forumStatistics.getAverageCommentsPost(), 0.01);
        assertEquals(0, forumStatistics.getAverageCommentsUser(),0.01);
    }
    @Test
    void testWhenNoOfCommentsIsSmallerThanNoOfPost() {
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(120);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        assertEquals(0.83, forumStatistics.getAverageCommentsPost(),0.01);
        assertEquals(16.67, forumStatistics.getAverageCommentsUser(),0.01);
        assertEquals(20, forumStatistics.getAveragePostsUser(),0.01);
    }
    @Test
    void testWhenNoOfCommentsIsHigherThanNoOfPost() {
        when(statisticsMock.commentsCount()).thenReturn(120);
        when(statisticsMock.postsCount()).thenReturn(100);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        assertEquals(1.2, forumStatistics.getAverageCommentsPost(),0.01);
        assertEquals(20, forumStatistics.getAverageCommentsUser(),0.01);
        assertEquals(16.67, forumStatistics.getAveragePostsUser(),0.01);
    }
    @Test
    void testWhenNoOfUsersIs0() {
        List<String> userNames = new ArrayList<>();
        userNames.isEmpty();

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(120);
        when(statisticsMock.postsCount()).thenReturn(100);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        assertEquals(0, forumStatistics.getAverageCommentsUser(),0.01);
        assertEquals(0, forumStatistics.getAveragePostsUser(),0.01);
    }
    @Test
    void testWhenNoOfUsersIs100() {

        List<String> userNames = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
        userNames.add("User" + n);
        }

        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(120);
        when(statisticsMock.postsCount()).thenReturn(100);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        assertEquals(1.2, forumStatistics.getAverageCommentsUser(),0.01);
        assertEquals(1, forumStatistics.getAveragePostsUser(),0.01);
    }
}
