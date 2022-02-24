package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Adam", "Asnyk");
        LocalDate dateOfOrder = LocalDate.of(2022, 2, 22);
        Product product = new Product("book-001", 19.99);


        return new OrderRequest(user, dateOfOrder, product);
    }

}
