package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTaskQueueTestSuite {
    @Test
    public void testUpdate() {
        // Given
        StudentTaskQueue student1 = new StudentTaskQueue("student1");
        StudentTaskQueue student2 = new StudentTaskQueue("student2");
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");
        student1.registerObserver(mentor1);
        student2.registerObserver(mentor2);
        // When
        student1.addTask("Task 1.1");
        student1.addTask("Task 1.2");
        student2.addTask("Task 1.1");
        student2.addTask("Task 1.2");
        student2.addTask("Task 1.3");
        // Then
        assertEquals(2, mentor1.getUpdateCount());
        assertEquals(3, mentor2.getUpdateCount());
    }
}

