package com.example.textile_factory_management_system.NonUser;

public class Employee {
    private int employeeId,nid,accountbalance;
    private String name,role,depertment,remarks;
    private float performaneScore;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public int getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(int accountbalance) {
        this.accountbalance = accountbalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepertment() {
        return depertment;
    }

    public void setDepertment(String depertment) {
        this.depertment = depertment;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public float getPerformaneScore() {
        return performaneScore;
    }

    public void setPerformaneScore(float performaneScore) {
        this.performaneScore = performaneScore;
    }

    public Employee(int employeeId, int nid, int accountbalance, String name, String role, String depertment, String remarks, float performaneScore) {
        this.employeeId = employeeId;
        this.nid = nid;
        this.accountbalance = accountbalance;
        this.name = name;
        this.role = role;
        this.depertment = depertment;
        this.remarks = remarks;
        this.performaneScore = performaneScore;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", nid=" + nid +
                ", accountbalance=" + accountbalance +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", depertment='" + depertment + '\'' +
                ", remarks='" + remarks + '\'' +
                ", performaneScore=" + performaneScore +
                '}';
    }
}
