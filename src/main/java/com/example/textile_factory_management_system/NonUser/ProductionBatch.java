package com.example.textile_factory_management_system.NonUser;

import java.time.LocalDate;

public class ProductionBatch {
    private int batchId, quantity, orderId, targetId;
    private String productType;
    private boolean isComplete;
    private LocalDate createdOn;

    public int getBatchId() {
        return batchId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getTargetId() {
        return targetId;
    }

    public String getProductType() {
        return productType;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }
}
