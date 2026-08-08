package com.example.textile_factory_management_system.amanna.Worker.Model;

import com.example.textile_factory_management_system.NonUser.*;
import com.example.textile_factory_management_system.User;
import com.example.textile_factory_management_system.utility.FileReadWrite;
import javafx.collections.ObservableList;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Worker extends User implements Serializable {

    private String shiftTime, dailyTime;

    private static final String LEAVE_REQUESTS_FILE = "LeaveRequests.bin";
    private static final String SHIFT_CHANGE_REQUESTS_FILE = "ShiftChangeRequests.bin";
    private static final String ATTENDANCE_FILE = "Attendance.bin";
    private static final String COMPLAINTS_FILE = "Complaints.bin";
    private static final String PAYROLL_FILE = "Payroll.bin";
    private static final String PRODUCTION_TASKS_FILE = "ProductionTasks.bin";

    public Worker(int userId, String username, String password, String email, String role, String shiftTime, String dailyTime) {
        super(userId, username, password, email, role);
        this.shiftTime = shiftTime;
        this.dailyTime = dailyTime;
    }

    public String getShiftTime() {
        return shiftTime;
    }

    public String getDailyTime() {
        return dailyTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }

    public void setDailyTime(String dailyTime) {
        this.dailyTime = dailyTime;
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
   public static String viewDailyTaskQuota(){
       return "";
   }

   public static boolean clockIn(LocalTime attendanceTime) {
       try {
           Attendance attendance = new Attendance(LocalDate.now(), 1, "Worker Attendance", attendanceTime.toString(), "");
           FileReadWrite.append(attendance, ATTENDANCE_FILE);
           return true;
       } catch (Exception e) {
           return false;
       }
   }

    public static boolean clockOut(LocalTime attendanceTime) {
        try {
            Attendance attendance = new Attendance(LocalDate.now(), 1, "Worker Attendance", "", attendanceTime.toString());
            FileReadWrite.append(attendance, ATTENDANCE_FILE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean submitComplaintToHR(String complaintStatement){
        try {
            ObservableList<Complaint> complaints = FileReadWrite.loadData(Complaint.class, COMPLAINTS_FILE);
            Complaint complaint = new Complaint(complaints.size() + 1, 1, complaintStatement, "", "Unresolved");
            complaints.add(complaint);
            FileReadWrite.saveData(complaints, COMPLAINTS_FILE);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Payroll loadCurrentMonthSalary(String month) {
        ObservableList<Payroll> payrolls = FileReadWrite.loadData(Payroll.class, PAYROLL_FILE);
        for (Payroll p:payrolls) {
            if (p.getMonth().equals(month)) {
                return p;
            }
        }
        return null;
    }

    public static ObservableList<ProductionTask> loadAllProductionTasks() {
        return FileReadWrite.loadData(ProductionTask.class, PRODUCTION_TASKS_FILE);
    }
}
