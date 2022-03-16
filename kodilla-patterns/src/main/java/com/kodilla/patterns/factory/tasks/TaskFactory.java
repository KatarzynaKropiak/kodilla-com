package com.kodilla.patterns.factory.tasks;



public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping", "Oranges", 4);
            case PAINTINGTASK:
                return new PaintingTask("Painting", "blue", "wall");
            case DRIVINGTASK:
                return new DrivingTask("Driving", "home", "red car");
            default:
                return null;
        }

    }
}
