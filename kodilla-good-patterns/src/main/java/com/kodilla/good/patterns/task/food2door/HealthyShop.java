package com.kodilla.good.patterns.task.food2door;

public class HealthyShop implements Producer {
    @Override
    public boolean process(String product, double quantity) {
        System.out.println("Order by API: " + product + " " + quantity);
        return false;
    }
}
