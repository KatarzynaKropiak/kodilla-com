package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;


    public OrderProcessor(final InformationService informationService,
                            final OrderService orderService,
                            final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final User user, final LocalDate dateOfOrder, final Product product) {
        boolean madeOrder = orderService.order(user, dateOfOrder, product);
        if (madeOrder) {
            informationService.inform(user);
            orderRepository.createOrder(user, dateOfOrder, product);
            return new OrderDto(user, true);
        } else {
            return new OrderDto(user, false);
        }
    }
}
