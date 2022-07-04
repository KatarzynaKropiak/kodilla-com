package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCost() {
    //Given
    PizzaIngredients pizza = new BasicPizza();
    System.out.println(pizza.getCost());
    //When
    BigDecimal calculatedCost = pizza.getCost();
    // Then
    assertEquals(new BigDecimal(20.00), calculatedCost);
}

    @Test
    public void testBasicPizzaGetIngredients() {
        //Given
        PizzaIngredients pizza = new BasicPizza();
        System.out.println(pizza.getIngredients());
        //When
        String ingredients = pizza.getIngredients();
        // Then
        assertEquals("Basic pizza", ingredients);
    }

    @Test
    public void testPizzaWithVeganCheeseAndPepperGetCost() {
        //Given
        PizzaIngredients pizza = new BasicPizza();
        pizza = new VeganCheese(pizza);
        pizza = new Pepper(pizza);
        System.out.println(pizza.getCost());
        //When
        BigDecimal calculatedCost = pizza.getCost();
        // Then
        assertEquals(new BigDecimal(24.00), calculatedCost);
    }

    @Test
    public void testPizzaWithVeganCheeseAndPepperGetIngredients() {
        //Given
        PizzaIngredients pizza = new BasicPizza();
        pizza = new VeganCheese(pizza);
        pizza = new Pepper(pizza);
        System.out.println(pizza.getIngredients());
        //When
        String ingredients = pizza.getIngredients();
        // Then
        assertEquals("Basic pizza + vegan cheese + pepper", ingredients);
    }

    @Test
    public void testPizzaWithAllIngredientsGetCost() {
        //Given
        PizzaIngredients pizza = new BasicPizza();
        pizza = new VeganCheese(pizza);
        pizza = new Pepper(pizza);
        pizza = new Mushrooms(pizza);
        pizza = new Olives(pizza);
        pizza = new Onions(pizza);
        System.out.println(pizza.getCost());
        //When
        BigDecimal calculatedCost = pizza.getCost();
        // Then
        assertEquals(new BigDecimal(30.00), calculatedCost);
    }

    @Test
    public void testPizzaWithAllIngredientsGetDescription() {
        //Given
        PizzaIngredients pizza = new BasicPizza();
        pizza = new VeganCheese(pizza);
        pizza = new Pepper(pizza);
        pizza = new Mushrooms(pizza);
        pizza = new Olives(pizza);
        pizza = new Onions(pizza);
        System.out.println(pizza.getIngredients());
        //When
        String ingredients = pizza.getIngredients();
        // Then
        assertEquals("Basic pizza + vegan cheese + pepper + mushrooms + olives + onions", ingredients);
    }
}
