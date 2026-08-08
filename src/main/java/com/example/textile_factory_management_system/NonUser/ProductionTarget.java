package com.example.textile_factory_management_system.NonUser;

import java.time.LocalDate;

public class ProductionTarget {
    private int targetId, targetAmount, completedQuota;
    private String productType;
    private LocalDate deadline;
    private boolean isCompleted;
}
