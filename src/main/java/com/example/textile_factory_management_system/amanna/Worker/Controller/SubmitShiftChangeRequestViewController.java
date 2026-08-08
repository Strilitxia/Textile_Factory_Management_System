package com.example.textile_factory_management_system.amanna.Worker.Controller;

import com.example.textile_factory_management_system.NonUser.ShiftChangeRequest;
import com.example.textile_factory_management_system.amanna.Worker.Model.Worker;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class SubmitShiftChangeRequestViewController
{

    @javafx.fxml.FXML
    private ComboBox<String> currentShiftCB;
    @javafx.fxml.FXML
    private Text success;
    @javafx.fxml.FXML
    private ComboBox<String> desiredShiftCB;

    @javafx.fxml.FXML
    public void initialize() {
        currentShiftCB.getItems().addAll("Morning", "Evening");
        desiredShiftCB.getItems().addAll("Morning", "Evening");
    }

    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {
        success.setText(null);
        if (currentShiftCB.getValue().isBlank() || desiredShiftCB.getValue().isBlank()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Enter value of fields properly!");
            a.showAndWait();
        } else {
            if (Worker.submitShiftChangeRequest(currentShiftCB.getValue(), desiredShiftCB.getValue())) {
                success.setText("Request submitted successfully!");
            } else {
                success.setText("Request not submitted due to an error!");
            }
        }
    }
}