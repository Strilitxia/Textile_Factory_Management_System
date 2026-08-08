package com.example.textile_factory_management_system.amanna.Worker.Controller;

import com.example.textile_factory_management_system.amanna.Worker.Model.Worker;
import com.example.textile_factory_management_system.utility.AlertHelper;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SendcomplainsToHRController
{
    @javafx.fxml.FXML
    private TextField complainsInDetailsTF;
    @javafx.fxml.FXML
    private Text sendComplainsToHRLabel;
    @javafx.fxml.FXML
    private Label submittedLabel;

    @javafx.fxml.FXML
    public void sendbuttonOA(ActionEvent actionEvent) {
        submittedLabel.setText(null);
        if (Worker.submitComplaintToHR(complainsInDetailsTF.getText())) {
            submittedLabel.setText("Complaint sent successfully.");
        } else {
            AlertHelper.showError("An error occurred.");
        }
    }
}