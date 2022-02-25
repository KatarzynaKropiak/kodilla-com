package com.kodilla.good.patterns.task.food2door;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Application {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Which producer?");
        String producer = scan.nextLine();

        OrderProcessor orderProcessor = new OrderProcessor();

        Map<String, Producer> producerMap = new HashMap<String, Producer>();
        producerMap.put("Extra Food Shop", new ExtraFoodShop());
        producerMap.put("Healthy Shop", new ExtraFoodShop());
        producerMap.put("Gluten Free Shop", new ExtraFoodShop());


        if (producerMap.get(producer) != null) {
            orderProcessor.order(producerMap.get(producer));
        } else {
            System.out.println("Producer doesn't exist in database");
        }
    }
}

