package com.example.textile_factory_management_system.amanna.COO.Model;

import com.example.textile_factory_management_system.NonUser.*;
import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class COO {
    private static final String EMPLOYEES_FILE = "Employees.bin";
    private static final String ORDERS_FILE = "Orders.bin";
    private static final String PRODUCTION_TARGETS_FILE = "ProductionTargets.bin";
    private static final String LARGE_ORDERS_FILE = "LargeOrders.bin";
    private static final String PRODUCTION_BATCHES_FILE = "ProductionBatches.bin";
    private static final String QUOTATIONS_FILE = "Quotations.bin";

    public static ObservableList<Employee> loadAllEmployees() {
        return FileReadWrite.loadData(Employee.class, EMPLOYEES_FILE);
    }

    public static ArrayList<Order> viewSalesSummary(LocalDate startDate, LocalDate endDate){
        ArrayList<Order> ordersWithinRange = new ArrayList<>();
        for (Order o:FileReadWrite.loadData(Order.class, ORDERS_FILE)) {
            if (o.getScheduleDate().isBefore(endDate) && o.getScheduleDate().isAfter(startDate) && o.getStatus().equals("Completed")) {
                ordersWithinRange.add(o);
            }
        }
        return ordersWithinRange;
    }

    public static boolean setProductionTarget(String productType, int targetAmount, LocalDate deadline) {
        try {
            ProductionTarget productionTarget = new ProductionTarget(targetAmount, productType, deadline);
            FileReadWrite.append(productionTarget, PRODUCTION_TARGETS_FILE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static ObservableList<ProductionTarget> loadAllProductionTargets() {
        return FileReadWrite.loadData(ProductionTarget.class, PRODUCTION_TARGETS_FILE);
    }

    public static ObservableList<LargeOrder> loadAllLargeOrders() {
        return FileReadWrite.loadData(LargeOrder.class, LARGE_ORDERS_FILE);
    }

    public static boolean approveRejectLargeOrders(int orderId, String action) {
        ObservableList<LargeOrder> largeOrders = COO.loadAllLargeOrders();
        for (int i = 0; i < largeOrders.size(); i++) {
            LargeOrder currentOrder = largeOrders.get(i);
            if (currentOrder.getOrderId() == orderId){
                currentOrder.setStatus(action);
                largeOrders.set(i, currentOrder);
                FileReadWrite.saveData(largeOrders, LARGE_ORDERS_FILE);
                return true;
            }
        }
        return false;
    }

    public static String generateMonthlyPerformanceReport(String month, int year) {
        ObservableList<Order> orders = FileReadWrite.loadData(Order.class, ORDERS_FILE);
        ObservableList<Quotation> quotations = FileReadWrite.loadData(Quotation.class, QUOTATIONS_FILE);
        ObservableList<ProductionBatch> productionBatches = FileReadWrite.loadData(ProductionBatch.class, PRODUCTION_BATCHES_FILE);

        int quotationsNumber = 0, ordersNumber = 0, productionBatchesNumber = 0;
        for (Order o:orders){
            if (o.getScheduleDate().getYear() == year && o.getScheduleDate().getMonth().equals(Month.valueOf(month.toUpperCase()))){
                ordersNumber += 1;
            }
        }

        for (Quotation q:quotations){
            if (q.getSubmittedOn().getMonth().equals(Month.valueOf(month.toUpperCase())) && q.getSubmittedOn().getYear() == year){
                quotationsNumber += 1;
            }
        }

        for (ProductionBatch p:productionBatches){
            if (p.getCreatedOn().getMonth().equals(Month.valueOf(month.toUpperCase())) && p.getCreatedOn().getYear() == year){
                productionBatchesNumber += 1;
            }
        }

        return "Number of Orders: " + ordersNumber
                + "\nNumber of Production Batches: " + productionBatchesNumber
                + "\nNumber of Quotations Received: " + quotationsNumber;
    }
}
