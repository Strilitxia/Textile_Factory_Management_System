package com.example.textile_factory_management_system.NonUser;

import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;

import java.io.Serializable;
import java.time.LocalDate;

public class ProductionBatch implements Serializable {
    private int batchId, quantity, orderId, targetId;
    private String productType;
    private String completeStatus;
    private LocalDate createdOn;

    public ProductionBatch(int batchId, int quantity, int orderId, int targetId, String productType, String completeStatus, LocalDate createdOn) {
        this.batchId = batchId;
        this.quantity = quantity;
        this.orderId = orderId;
        this.targetId = targetId;
        this.productType = productType;
        this.completeStatus = "Incomplete";
        this.createdOn = createdOn;
    }

    public int getBatchId() {
        return batchId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTargetQuantity() {
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

    public String getCompleteStatus() {
        return completeStatus;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }
}
