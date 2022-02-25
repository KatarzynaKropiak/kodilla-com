package com.kodilla.good.patterns.task.food2door;

import java.util.Scanner;

public class OrderProcessor {

    public boolean order(Producer producer) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which product?");
        String product = scan.nextLine();

        System.out.println("You choose " + product);

        System.out.println("Quantity: ");
        double quantity = scan.nextDouble();

        System.out.println("You choose " + quantity);

        return producer.process(product, quantity);
    }
}
