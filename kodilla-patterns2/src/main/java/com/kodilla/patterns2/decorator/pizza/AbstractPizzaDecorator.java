package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class AbstractPizzaDecorator implements PizzaIngredients {
    private final PizzaIngredients pizzaIngredients;

    protected AbstractPizzaDecorator (PizzaIngredients pizzaIngredients) {
        this.pizzaIngredients = pizzaIngredients;
    }

    @Override
    public BigDecimal getCost() {
        return  pizzaIngredients.getCost();
    }

    @Override
    public String getIngredients() {
        return pizzaIngredients.getIngredients();
    }
}