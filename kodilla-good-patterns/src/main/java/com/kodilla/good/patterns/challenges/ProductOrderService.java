package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderService implements OrderService{

    public boolean order(final User user, final LocalDate dateOfOrder, final Product product) {
        System.out.println("Name: " + user.getName() + user.getSurname()
                + " order date: " + dateOfOrder.toString() + " product price: " + product.getPrice());

        return true;
    }
}
