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

}
