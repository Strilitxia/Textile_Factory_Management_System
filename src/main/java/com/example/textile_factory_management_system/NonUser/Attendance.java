package com.example.textile_factory_management_system.NonUser;

import java.io.Serializable;
import java.time.LocalDate;

public class Attendance implements Serializable {
    private LocalDate timestamp;
    private int employeeID;
    private String attendanceType,inTime,outTime;

    public Attendance(LocalDate timestamp, int employeeID, String attendanceType, String inTime, String outTime) {
        this.timestamp = timestamp;
        this.employeeID = employeeID;
        this.attendanceType = attendanceType;
        this.inTime = inTime;
        this.outTime = outTime;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public String getAttendanceType() {
        return attendanceType;
    }

    public void setAttendanceType(String attendanceType) {
        this.attendanceType = attendanceType;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "timestamp=" + timestamp +
                ", employeeID=" + employeeID +
                ", attendanceType='" + attendanceType + '\'' +
                '}';
    }
}
