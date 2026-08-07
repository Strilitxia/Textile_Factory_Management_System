package com.example.textile_factory_management_system.NonUser;

public class Salary extends User{
    private final int employeeID;
    private float baseRate;
    private float bonusAmount;

    public int getEmployeeID() {
        return employeeID;
    }

    public float getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(float baseRate) {
        this.baseRate = baseRate;
    }

    public float getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(float bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public Salary(int employeeID, float baseRate, float bonusAmount) {
        this.employeeID = employeeID;
        this.baseRate = baseRate;
        this.bonusAmount = bonusAmount;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "employeeID=" + employeeID +
                ", baseRate=" + baseRate +
                ", bonusAmount=" + bonusAmount +
                '}';
    }
}
