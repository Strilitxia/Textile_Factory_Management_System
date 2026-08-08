package com.example.textile_factory_management_system.NonUser;

import com.example.textile_factory_management_system.User;

public class ProductionTask {
    private int taskId;
    private User assignedTo;
    private String description;

    public int getTaskId() {
        return taskId;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public String getDescription() {
        return description;
    }

    public ProductionTask(int taskId, User assignedTo, String description) {
        this.taskId = taskId;
        this.assignedTo = assignedTo;
        this.description = description;
    }
}
