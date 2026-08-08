package com.example.textile_factory_management_system.NonUser;

import java.io.Serializable;

public class Payroll implements Serializable {
    private int payroll;
    private int employeeId;
    private String month;
    private float baserate;
    private  float overtimeHours;
    private float bonusAmount;
    private float deductions;
    private float netPay;
    private String status;

    public Payroll(int employeeId, String month, float baserate, float overtimeHours, float bonusAmount, float deductions, float netPay, String status) {
        this.payroll = employeeId;
        this.employeeId = employeeId;
        this.month = month;
        this.baserate = baserate;
        this.overtimeHours = overtimeHours;
        this.bonusAmount = bonusAmount;
        this.deductions = deductions;
        this.netPay = netPay;
        this.status = status;
    }

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

    public void setStatus(String status) {
        this.status = status;
    }
}
