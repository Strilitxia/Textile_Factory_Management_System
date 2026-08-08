package com.example.textile_factory_management_system.amanna.Worker.Model;

import com.example.textile_factory_management_system.NonUser.Attendance;
import com.example.textile_factory_management_system.NonUser.LeaveRequest;
import com.example.textile_factory_management_system.NonUser.ShiftChangeRequest;
import com.example.textile_factory_management_system.User;
import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.ArrayList;

public class Worker extends User {

    private static final String LEAVE_REQUESTS_FILE = "LeaveRequests.bin";
    private static final String SHIFT_CHANGE_REQUESTS_FILE = "ShiftChangeRequests.bin";
    private static final String ATTENDANCE_FILE = "Attendance.bin";

    public Worker(int userId, String username, String password, String email, String role) {
        super(userId, username, password, email, role);
    }

    public static boolean submitLeaveRequest(LocalDate leaveDate, String reason) {
        try {
            LeaveRequest leaveRequest = new LeaveRequest(
                    (int) System.currentTimeMillis(),
                    1,
                    leaveDate,
                    reason,
                    false
            );
            FileReadWrite.append(leaveRequest, LEAVE_REQUESTS_FILE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean submitShiftChangeRequest(String oldShift, String newShift) {
        try {
            ShiftChangeRequest shiftChangeRequest = new ShiftChangeRequest(
                    (int) System.currentTimeMillis(),
                    1,
                    oldShift,
                    newShift,
                    false
            );
            FileReadWrite.append(shiftChangeRequest, SHIFT_CHANGE_REQUESTS_FILE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static ArrayList<Attendance> loadAttendance(int workerId) {
        ObservableList<Attendance> attendances = FileReadWrite.loadData(Attendance.class, ATTENDANCE_FILE);
        ArrayList<Attendance> attendanceArrayList = new ArrayList<>();
        for (Attendance attendance:attendances) {
            if (attendance.getEmployeeID() == workerId) {
                attendanceArrayList.add(attendance);
            }
        }
        return attendanceArrayList;
    }
   public static  String viewDailyTaskQuota(){

   }
}
