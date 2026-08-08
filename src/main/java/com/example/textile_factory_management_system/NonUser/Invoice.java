package com.example.textile_factory_management_system.NonUser;

public class Invoice {
    private int invoiceId,orderId;
    private float totalAmount;

    public Invoice(int invoiceId, int orderId, float totalAmount) {
        this.invoiceId = invoiceId;
        this.orderId = orderId;
        this.totalAmount = totalAmount;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public int getOrderId() {
        return orderId;
    }

    public float getTotalAmount() {
        return totalAmount;
    }
}
