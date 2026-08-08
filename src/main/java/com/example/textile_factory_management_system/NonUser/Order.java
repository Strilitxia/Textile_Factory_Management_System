package com.example.textile_factory_management_system.NonUser;

import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class Order {
    protected int customerId, orderId, quantity;
    protected String productType,status;
    protected LocalDate scheduleDate;
    protected boolean largeOrder;

    public boolean isLargeOrder() {
        int LARGE_ORDER_THRESHOLD = 500;
        if (this.quantity >= LARGE_ORDER_THRESHOLD) {
            LargeOrder largeOrder1 = new LargeOrder(this.customerId, this.quantity, this.productType, this.status, this.scheduleDate);
            FileReadWrite.append(largeOrder1, "LargeOrders.bin");
        }
        return this.quantity >= LARGE_ORDER_THRESHOLD;
    }

    public int generateOrderId() {
        ObservableList<Order> orders = FileReadWrite.loadData(Order.class, "Orders.bin");
        return orders.size() + 1;
    }

    public Order(int customerId, int quantity, String productType, String status, LocalDate scheduleDate) {
        this.customerId = customerId;
        this.orderId = this.generateOrderId();
        this.quantity = quantity;
        this.productType = productType;
        this.status = status;
        this.scheduleDate = scheduleDate;
        this.largeOrder = this.isLargeOrder();
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductType() {
        return productType;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getScheduleDate() {
        return scheduleDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
