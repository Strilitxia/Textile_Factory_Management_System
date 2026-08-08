package com.example.textile_factory_management_system.NonUser;

public class BankReceipt {
    private int orderId;
    private String bankName,transactionId;

    public BankReceipt(int orderId, String bankName, String transactionId) {
        this.orderId = orderId;
        this.bankName = bankName;
        this.transactionId = transactionId;
    }
}
