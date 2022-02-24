package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {
    private User user;
    private LocalDate dateOfOrder;
    private Product product;

    public OrderRequest(final User user, final LocalDate dateOfOrder, final Product product) {
        this.user = user;
        this.dateOfOrder = dateOfOrder;
        this.product = product;
    }

    public User getUser() { return user; }

    public LocalDate getDateOfOrder() { return dateOfOrder; }

    public Product getProduct() { return product; }
}
