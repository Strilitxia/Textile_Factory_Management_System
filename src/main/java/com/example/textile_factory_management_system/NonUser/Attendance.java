package com.example.textile_factory_management_system.NonUser;

import java.time.LocalDate;

public class Attendance {
    private LocalDate timestamp;
    private final int employeeID;
    private String attendanceType;

    public Attendance(LocalDate timestamp, int employeeID, String attendanceType) {
        this.timestamp = timestamp;
        this.employeeID = employeeID;
        this.attendanceType = attendanceType;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    public int getEmployeeID() {
        return employeeID;
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
