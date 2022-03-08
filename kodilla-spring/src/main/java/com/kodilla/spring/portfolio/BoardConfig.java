package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.core.task.TaskRejectedException;

public class BoardConfig {

    @Autowired
    @Qualifier("list1")
    TaskList toDoList;
    @Autowired
    @Qualifier("list2")
    TaskList inProgressList;
    @Autowired
    @Qualifier("list3")
    TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "list1")
    @Scope("prototype")
    public TaskList getTaskList1() {
        return new TaskList();
    }

    @Bean(name = "list2")
    @Scope("prototype")
    public TaskList getTaskList2() {
        return new TaskList();
    }

    @Bean(name = "list3")
    @Scope("prototype")
    public TaskList getTaskList3() {
        return new TaskList();
    }
}

