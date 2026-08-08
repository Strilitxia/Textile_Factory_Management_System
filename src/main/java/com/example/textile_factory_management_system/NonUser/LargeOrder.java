package com.example.textile_factory_management_system.NonUser;

import java.time.LocalDate;

public class LargeOrder extends Order{
    private boolean approved;
    private LocalDate approvedOn;

    public LargeOrder(int customerId, int quantity, String productType, String status, LocalDate scheduleDate) {
        super(customerId, quantity, productType, status, scheduleDate);
    }
}
