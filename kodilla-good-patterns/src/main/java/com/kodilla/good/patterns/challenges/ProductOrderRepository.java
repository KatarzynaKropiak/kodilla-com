package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderRepository implements OrderRepository{
    public boolean createOrder(User user, LocalDate dateOfOrder, Product product) {
        return true;
    }
}
