package com.example.textile_factory_management_system.NonUser;

import java.time.LocalDate;

public class ProductionTarget {
    private int targetId, targetAmount, completedQuota;
    private String productType;
    private LocalDate deadline;
    private String status;

    public ProductionTarget(int targetId, int targetAmount, int completedQuota, String productType, LocalDate deadline, String status) {
        this.targetId = targetId;
        this.targetAmount = targetAmount;
        this.completedQuota = completedQuota;
        this.productType = productType;
        this.deadline = deadline;
        this.status = status;
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
}
