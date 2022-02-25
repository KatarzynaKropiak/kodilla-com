package com.kodilla.good.patterns.task.food2door;

public class ExtraFoodShop implements Producer {
    @Override

    public boolean process(String product, double quantity) {
        System.out.println("Order by e-mail: " + product + " " + quantity);
        return false;
    }
}
