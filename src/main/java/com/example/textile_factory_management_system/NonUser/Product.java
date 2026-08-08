package com.example.textile_factory_management_system.NonUser;

public class Product {
    private int productId;
    private String description;
    private float price;

    public Product(int productId, String description, float price) {
        this.productId = productId;
        this.description = description;
        this.price = price;
    }
}
