package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTaskQueue implements Observable {
    private final List<String> tasks;
    private final List<Observer> observers;
    private final String studentName;
    private int updateCount;

    public StudentTaskQueue(String studentName) {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
        updateCount++;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public int getUpdateCount() {
        return updateCount;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }
}

