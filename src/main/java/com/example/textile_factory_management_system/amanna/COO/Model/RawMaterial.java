package com.example.textile_factory_management_system.amanna.COO.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class RawMaterial implements Serializable {
    private int materialId;
    private String materialName;
    private int stockQuantity;
    private int unitPrice;
    private LocalDate validity;

    public RawMaterial(int materialId, String materialName, int stockQuantity, int unitPrice, LocalDate validity) {
        this.materialId = materialId;
        this.materialName = materialName;
        this.stockQuantity = stockQuantity;
        this.unitPrice = unitPrice;
        this.validity = validity;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LocalDate getValidity() {
        return validity;
    }

    public void setValidity(LocalDate validity) {
        this.validity = validity;
    }

    @Override
    public String toString() {
        return "RawMaterial{" +
                "materialId=" + materialId +
                ", materialName='" + materialName + '\'' +
                ", stockQuantity=" + stockQuantity +
                ", unitPrice=" + unitPrice +
                ", validity=" + validity +
                '}';
    }
}
