package com.example.textile_factory_management_system.NonUser;

import java.time.LocalDate;

public class Attendance {
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
