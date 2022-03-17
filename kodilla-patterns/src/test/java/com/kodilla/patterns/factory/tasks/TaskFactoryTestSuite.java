package com.kodilla.patterns.factory.tasks;
import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.ShapeFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPINGTASK);
        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertEquals("Buy: 4.0 x Oranges", shopping.executeTask());
        assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.createTask(TaskFactory.PAINTINGTASK);
        //Then
        assertEquals("Painting", painting.getTaskName());
        assertEquals("Painting wall blue", painting.executeTask());
        assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.createTask(TaskFactory.DRIVINGTASK);
        //Then
        assertEquals("Driving", driving.getTaskName());
        assertEquals("Driving home using red car", driving.executeTask());
        assertEquals( true, driving.isTaskExecuted());
    }
}