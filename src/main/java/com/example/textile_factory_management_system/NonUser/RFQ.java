package com.example.textile_factory_management_system.NonUser;

public class RFQ {
    private int rfqId, customerId, productId;
    private float bulkQuantity;

    public RFQ(int rfqId, int customerId, int productId, float bulkQuantity) {
        this.rfqId = rfqId;
        this.customerId = customerId;
        this.productId = productId;
        this.bulkQuantity = bulkQuantity;
    }
}
