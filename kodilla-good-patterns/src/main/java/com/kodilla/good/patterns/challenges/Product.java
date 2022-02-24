package com.kodilla.good.patterns.challenges;

public class Product {
    String sku;
    Double price;

    public Product(String sku, Double price) {
        this.sku = sku;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public Double getPrice() {
        return price;
    }

}
