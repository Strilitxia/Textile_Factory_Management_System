package com.example.textile_factory_management_system.amanna.Worker.Controller;

import com.example.textile_factory_management_system.amanna.Worker.Model.Worker;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class SubmitPersonalLeaveRequestController
{
    @javafx.fxml.FXML
    private Text submitPersonalLeaveRequestLabel;
    @javafx.fxml.FXML
    private DatePicker leaveDatesDP;
    @javafx.fxml.FXML
    private TextField reasonTF;

    @javafx.fxml.FXML
    public void submitButtonOA(ActionEvent actionEvent) {
        submitPersonalLeaveRequestLabel.setText(null);
        if (leaveDatesDP.getValue() == null || reasonTF.getText().isBlank()){
            Alert aa = new Alert(Alert.AlertType.ERROR);
            aa.setContentText("Fill out all fields!");
            aa.showAndWait();
        } else {
            if (Worker.submitLeaveRequest(leaveDatesDP.getValue(), reasonTF.getText())){
                submitPersonalLeaveRequestLabel.setText("Request submitted successfully!");
            } else {
                submitPersonalLeaveRequestLabel.setText("Request not submitted due to an error!");
            }
        }
    }
}