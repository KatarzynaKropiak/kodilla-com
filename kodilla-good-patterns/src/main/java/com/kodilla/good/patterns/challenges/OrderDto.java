package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private User user;
    private boolean madeOrder;

    public OrderDto(final User user, final boolean madeOrder) {
        this.user = user;
        this.madeOrder = madeOrder;
    }

    public User getUser() { return user; }

    public boolean madaOrder() { return madeOrder; }

}
