package com.kodilla.good.patterns.task.food2door;

public class GlutenFreeShop implements Producer {
    @Override
    public boolean process(String product, double quantity) {
        System.out.println("Order by SMS: " + product + " " + quantity);
        return false;
    }
}
