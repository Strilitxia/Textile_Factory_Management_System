package com.example.textile_factory_management_system.amanna.COO.Model;

import com.example.textile_factory_management_system.NonUser.Employee;
import com.example.textile_factory_management_system.NonUser.Order;
import com.example.textile_factory_management_system.NonUser.ProductionTarget;
import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.ArrayList;

public class COO {
    private static final String EMPLOYEES_FILE = "Employees.bin";
    private static final String ORDERS_FILE = "Orders.bin";
    private static final String PRODUCTION_TARGETS_FILE = "ProductionTargets.bin";

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

}
