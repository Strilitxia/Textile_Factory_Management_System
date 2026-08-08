package com.example.textile_factory_management_system.NonUser;

import java.time.LocalDate;

public class Order {
    private int customerId, orderId, quantity;
    private String productType,status;
    private LocalDate scheduleDate;
    private boolean largeOrder;

    public boolean isLargeOrder() {
        int LARGE_ORDER_THRESHOLD = 500;
        return this.quantity >= LARGE_ORDER_THRESHOLD;
    }

    public Order(int customerId, int orderId, int quantity, String productType, String status, LocalDate scheduleDate, boolean largeOrder) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.quantity = quantity;
        this.productType = productType;
        this.status = status;
        this.scheduleDate = scheduleDate;
        this.largeOrder = largeOrder;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductType() {
        return productType;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getScheduleDate() {
        return scheduleDate;
    }
}
