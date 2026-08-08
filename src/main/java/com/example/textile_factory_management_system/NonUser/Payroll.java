package com.example.textile_factory_management_system.NonUser;

public class Payroll {
    private int payroll;
    private int employeeId;
    private String month;
    private float baserate;
    private  float overtimeHours;
    private float bonusAmount;
    private float deductions;
    private float netPay;
    private String status;

    public int getPayroll() {
        return payroll;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getMonth() {
        return month;
    }

    public float getBaserate() {
        return baserate;
    }

    public float getOvertimeHours() {
        return overtimeHours;
    }

    public float getBonusAmount() {
        return bonusAmount;
    }

    public float getDeductions() {
        return deductions;
    }

    public float getNetPay() {
        return netPay;
    }

    public String getStatus() {
        return status;
    }
}
