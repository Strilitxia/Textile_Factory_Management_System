package com.example.textile_factory_management_system.NonUser;

import java.io.Serializable;

public class MaterialRequisition implements Serializable {
    private int requestId;
    private String materialType;
    private float amount;

    public MaterialRequisition(String materialType, float amount) {
        this.requestId = (int) System.currentTimeMillis();
        this.materialType = materialType;
        this.amount = amount;
    }

    public int getRequestId() {
        return requestId;
    }

    public String getMaterialType() {
        return materialType;
    }

    public float getAmount() {
        return amount;
    }
}
