package com.example.textile_factory_management_system.NonUser;

import com.example.textile_factory_management_system.User;

import java.io.Serializable;

public class ProductionTask implements Serializable {
    private int taskId;
    private int assignedTo;
    private String description;

    public ProductionTask(int taskId, int assignedTo, String description) {
        this.taskId = taskId;
        this.assignedTo = assignedTo;
        this.description = description;
    }

    public int getTaskId() {
        return taskId;
    }

    public int getAssignedTo() {
        return assignedTo;
    }

    public String getDescription() {
        return description;
    }
}
