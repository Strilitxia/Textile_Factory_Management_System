package com.example.textile_factory_management_system.NonUser;

import java.io.Serializable;

public class ShiftChangeRequest implements Serializable {
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

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getOldShiftTime() {
        return oldShiftTime;
    }

    public void setOldShiftTime(String oldShiftTime) {
        this.oldShiftTime = oldShiftTime;
    }

    public String getNewShiftTime() {
        return newShiftTime;
    }

    public void setNewShiftTime(String newShiftTime) {
        this.newShiftTime = newShiftTime;
    }

    public boolean isApprove() {
        return isApprove;
    }

    public void setApprove(boolean approve) {
        isApprove = approve;
    }

    @Override
    public String toString() {
        return "ShiftChangeRequest{" +
                "scheduleId=" + scheduleId +
                ", workerId=" + workerId +
                ", oldShiftTime='" + oldShiftTime + '\'' +
                ", newShiftTime='" + newShiftTime + '\'' +
                ", isApprove=" + isApprove +
                '}';
    }
}
