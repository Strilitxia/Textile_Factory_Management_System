package com.example.textile_factory_management_system.NonUser;

import java.time.LocalDate;

public class LeaveRequest {
    private int requestid;
    private int workerid;
    private LocalDate leaveDates;
    private String reason;
    private boolean status;

    public LeaveRequest(int requestid, int workerid, LocalDate leaveDates, String reason, boolean status) {
        this.requestid = requestid;
        this.workerid = workerid;
        this.leaveDates = leaveDates;
        this.reason = reason;
        this.status = status;
    }

    public int getRequestid() {
        return requestid;
    }

    public void setRequestid(int requestid) {
        this.requestid = requestid;
    }

    public int getWorkerid() {
        return workerid;
    }

    public void setWorkerid(int workerid) {
        this.workerid = workerid;
    }

    public LocalDate getLeaveDates() {
        return leaveDates;
    }

    public void setLeaveDates(LocalDate leaveDates) {
        this.leaveDates = leaveDates;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "requestid=" + requestid +
                ", workerid=" + workerid +
                ", leaveDates=" + leaveDates +
                ", reason='" + reason + '\'' +
                ", status=" + status +
                '}';
    }
}
