package com.example.textile_factory_management_system.NonUser;

public class Complaint {
    private int complaintid;
    private  int workerId;
    private String details;
    private String resolutionRemarks;
    private boolean status;

    public Complaint(int complaintid, int workerId, String details, String resolutionRemarks, boolean status) {
        this.complaintid = complaintid;
        this.workerId = workerId;
        this.details = details;
        this.resolutionRemarks = resolutionRemarks;
        this.status = status;
    }

    public int getComplaintid() {
        return complaintid;
    }

    public void setComplaintid(int complaintid) {
        this.complaintid = complaintid;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getResolutionRemarks() {
        return resolutionRemarks;
    }

    public void setResolutionRemarks(String resolutionRemarks) {
        this.resolutionRemarks = resolutionRemarks;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "complaintid=" + complaintid +
                ", workerId=" + workerId +
                ", details='" + details + '\'' +
                ", resolutionRemarks='" + resolutionRemarks + '\'' +
                ", status=" + status +
                '}';
    }
}
