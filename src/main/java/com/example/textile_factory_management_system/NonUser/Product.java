package com.example.textile_factory_management_system.NonUser;

import java.io.Serializable;

public class Product implements Serializable {
    private int productId;
    private String description, productType;
    private float price;

    public Product(int productId, String description, String productType, float price) {
        this.productId = productId;
        this.description = description;
        this.productType = productType;
        this.price = price;
    }

    public String getProductType() {
        return productType;
    }

    public int getProductId() {
        return productId;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }
}
