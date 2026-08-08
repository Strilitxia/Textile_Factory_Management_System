package com.example.textile_factory_management_system.NonUser;

import java.util.ArrayList;

public class AttendanceRecord extends Attendance {
    private final int employeeID;

    public AttendanceRecord(LocalDate timestamp, int employeeID, String attendanceType, int employeeID1, AttendanceRecord arrayList) {
        super(timestamp, employeeID, attendanceType);
        this.employeeID = employeeID1;
        ArrayList = arrayList;
    }

    AttendanceRecord ArrayList =new AttendanceRecord<>;

    }

    public String toString() {
        return "AttendanceRecord{}";
    }
}
