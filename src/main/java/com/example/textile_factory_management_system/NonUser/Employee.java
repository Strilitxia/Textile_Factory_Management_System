package com.example.textile_factory_management_system.NonUser;

import com.example.textile_factory_management_system.User;
import com.example.textile_factory_management_system.amanna.Worker.Model.Worker;
import com.example.textile_factory_management_system.utility.FileReadWrite;

import java.io.Serializable;

public class Employee extends User implements Serializable {
    private int nid,accountbalance;
    private String name,depertment,remarks;
    private float performaneScore;

    public Employee(int userId, String username, String password, String email, String role, int nid, int accountbalance, String name, String depertment, String remarks, float performaneScore) {
        super(userId, username, password, email, role);
        this.nid = nid;
        this.accountbalance = accountbalance;
        this.name = name;
        this.depertment = depertment;
        this.remarks = remarks;
        this.performaneScore = performaneScore;

        if (this.role.equals("Worker")){
            Worker worker = new Worker(this.userId, this.username, this.password, this.email, this.role, null, null);
            FileReadWrite.append(worker, "Workers.bin");
        }
    }

    public int getNid() {
        return nid;
    }

    public int getAccountbalance() {
        return accountbalance;
    }

    public float getSalary() {
        return accountbalance;
    }

    public String getName() {
        return name;
    }

    public String getDepertment() {
        return depertment;
    }

    public String getDepartment() {
        return depertment;
    }

    public String getRemarks() {
        return remarks;
    }

    public float getPerformaneScore() {
        return performaneScore;
    }

    public float getPerformanceScore() {
        return performaneScore;
    }
}
