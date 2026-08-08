package com.example.textile_factory_management_system.NonUser;

public class RFQ {
    private int rfqId, customerId, productId;
    private float bulkQuantity;

    public int getRfqId() {
        return rfqId;
    }

    public void setRfqId(int rfqId) {
        this.rfqId = rfqId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getBulkQuantity() {
        return bulkQuantity;
    }

    public void setBulkQuantity(float bulkQuantity) {
        this.bulkQuantity = bulkQuantity;
    }

    public RFQ(int rfqId, int customerId, int productId, float bulkQuantity) {
        this.rfqId = rfqId;
        this.customerId = customerId;
        this.productId = productId;
        this.bulkQuantity = bulkQuantity;
    }

    @Override
    public String toString() {
        return "RFQ{" +
                "rfqId=" + rfqId +
                ", customerId=" + customerId +
                ", productId=" + productId +
                ", bulkQuantity=" + bulkQuantity +
                '}';
    }
}
