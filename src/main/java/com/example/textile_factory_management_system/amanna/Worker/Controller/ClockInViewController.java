package com.example.textile_factory_management_system.amanna.Worker.Controller;

import com.example.textile_factory_management_system.amanna.Worker.Model.Worker;
import com.example.textile_factory_management_system.utility.AlertHelper;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.time.LocalTime;

public class ClockInViewController
{
    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void clockInButtonOA(ActionEvent actionEvent) {
        outputLabel.setText(null);
        if (LocalTime.now().isAfter(LocalTime.of(9,0)) && LocalTime.now().isBefore(LocalTime.of(17,0))){
            if (Worker.clockIn(LocalTime.now())) {
                outputLabel.setText("Attendance clocked in at " + LocalTime.now());
            } else {
                AlertHelper.showError("An error occurred!");
            }
        } else {
            outputLabel.setText("Not in working hours (9-5) currently!");
        }
    }
}