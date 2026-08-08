package com.example.textile_factory_management_system.NonUser;

import java.time.LocalDate;

public class Quotation {
    private int quotationId,rfqId;
    private float proposedUnitPrice;
    private String productType;
    private String status;
    private LocalDate submittedOn;

    public Quotation(int quotationId, int rfqId, float proposedUnitPrice, String productType) {
        this.quotationId = quotationId;
        this.rfqId = rfqId;
        this.proposedUnitPrice = proposedUnitPrice;
        this.productType = productType;
        this.status = "Pending";
        this.submittedOn = LocalDate.now();
    }

    public int getQuotationId() {
        return quotationId;
    }

    public int getRfqId() {
        return rfqId;
    }

    public float getProposedUnitPrice() {
        return proposedUnitPrice;
    }

    public String getProductType() {
        return productType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getSubmittedOn() {
        return submittedOn;
    }
}