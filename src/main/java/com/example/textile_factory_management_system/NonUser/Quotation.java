package com.example.textile_factory_management_system.NonUser;

public class Quotation {
    private int quotationId,rfqId;
    private float proposedUnitPrice;
    private boolean isRejected;

    public int getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(int quotationId) {
        this.quotationId = quotationId;
    }

    public int getRfqId() {
        return rfqId;
    }

    public void setRfqId(int rfqId) {
        this.rfqId = rfqId;
    }

    public float getProposedUnitPrice() {
        return proposedUnitPrice;
    }

    public void setProposedUnitPrice(float proposedUnitPrice) {
        this.proposedUnitPrice = proposedUnitPrice;
    }

    public boolean isRejected() {
        return isRejected;
    }

    public void setRejected(boolean rejected) {
        isRejected = rejected;
    }

    public Quotation(int quotationId, int rfqId, float proposedUnitPrice, boolean isRejected) {
        this.quotationId = quotationId;
        this.rfqId = rfqId;
        this.proposedUnitPrice = proposedUnitPrice;
        this.isRejected = isRejected;
    }

    @Override
    public String toString() {
        return "Quotation{" +
                "quotationId=" + quotationId +
                ", rfqId=" + rfqId +
                ", proposedUnitPrice=" + proposedUnitPrice +
                ", isRejected=" + isRejected +
                '}';
    }
}



