package com.example.textile_factory_management_system.NonUser;

public class ShiftChangeRequest {
    private int scheduleId;
    private int workerId;
    private String oldShiftTime;
    private String newShiftTime;
    private boolean isApprove;

    public ShiftChangeRequest(int scheduleId, int workerId, String oldShiftTime, String newShiftTime, boolean isApprove) {
        this.scheduleId = scheduleId;
        this.workerId = workerId;
        this.oldShiftTime = oldShiftTime;
        this.newShiftTime = newShiftTime;
        this.isApprove = isApprove;
    }
}
