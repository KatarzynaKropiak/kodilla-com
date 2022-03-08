package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {


    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("task to Do 1");
        board.getInProgressList().addTask("task in Progress 1");
        board.getDoneList().addTask("done task 1");


        //Then
        System.out.println(board.getToDoList().getTask(0));
        System.out.println(board.getInProgressList().getTask(0));
        System.out.println(board.getDoneList().getTask(0));
    }

    }

