package com.example.textile_factory_management_system.NonUser;

import com.example.textile_factory_management_system.utility.FileReadWrite;

import java.time.LocalDate;

public class ProductionTarget {
    private int targetId, targetAmount, completedQuota;
    private String productType;
    private LocalDate deadline;
    private String status;

    public ProductionTarget(int targetAmount, String productType, LocalDate deadline) {
        this.targetId = this.generateTargetId();
        this.targetAmount = targetAmount;
        this.completedQuota = 0;
        this.productType = productType;
        this.deadline = deadline;
        this.status = "Incomplete";
    }

    private int generateTargetId() {
        return (FileReadWrite.loadData(ProductionTarget.class, "ProductionTargets.bin")).size() + 1;
    }
    public int getTargetId() {
        return targetId;
    }

    public int getTargetAmount() {
        return targetAmount;
    }

    public int getCompletedQuota() {
        return completedQuota;
    }

    public String getProductType() {
        return productType;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getStatus() {
        return status;
    }

    public void setCompletedQuota(int completedQuota) {
        this.completedQuota = completedQuota;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
