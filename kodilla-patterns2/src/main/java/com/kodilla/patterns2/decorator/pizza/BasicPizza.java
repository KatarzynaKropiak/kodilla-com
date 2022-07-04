package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizza implements PizzaIngredients {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(20.00);
    }

    @Override
    public String getIngredients() {
        return "Basic pizza";
    }
}
