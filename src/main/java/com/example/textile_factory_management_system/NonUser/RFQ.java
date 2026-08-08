package com.example.textile_factory_management_system.NonUser;

import java.io.Serializable;

public class RFQ implements Serializable {
    private int rfqId, customerId, productId;
    private float bulkQuantity;

    public RFQ(int rfqId, int customerId, int productId, float bulkQuantity) {
        this.rfqId = rfqId;
        this.customerId = customerId;
        this.productId = productId;
        this.bulkQuantity = bulkQuantity;
    }
}
