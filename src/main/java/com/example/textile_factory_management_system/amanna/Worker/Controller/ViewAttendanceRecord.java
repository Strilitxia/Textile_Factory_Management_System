package com.example.textile_factory_management_system.amanna.Worker.Controller;

import com.example.textile_factory_management_system.NonUser.Attendance;
import com.example.textile_factory_management_system.amanna.Worker.Model.Worker;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.time.LocalDate;

public class ViewAttendanceRecord
{

    @javafx.fxml.FXML
    private TableColumn<Attendance, String> outTimeTC;
    @javafx.fxml.FXML
    private TableView<Attendance> attendanceRecordTV;
    @javafx.fxml.FXML
    private TableColumn<Attendance, String> inTimeTC;
    @javafx.fxml.FXML
    private TableColumn<Attendance, LocalDate> dateTC;
    @javafx.fxml.FXML
    private Text vieAttendanceRecordLabel;
    @javafx.fxml.FXML
    private TextField employeeIdTF;

    @javafx.fxml.FXML
    public void initialize() {
        dateTC.setCellValueFactory(new PropertyValueFactory<>("timestamp"));
        inTimeTC.setCellValueFactory(new PropertyValueFactory<>("inTime"));
        outTimeTC.setCellValueFactory(new PropertyValueFactory<>("outTime"));
    }

    @javafx.fxml.FXML
    public void loadButtonOA(ActionEvent actionEvent) {
        attendanceRecordTV.getItems().clear();
        try {
            attendanceRecordTV.getItems().addAll(Worker.loadAttendance(Integer.parseInt(employeeIdTF.getText())));
        } catch (NumberFormatException e) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Enter valid NUMERIC employee ID.");
            a.showAndWait();
            employeeIdTF.setText(null);
        }
    }
}